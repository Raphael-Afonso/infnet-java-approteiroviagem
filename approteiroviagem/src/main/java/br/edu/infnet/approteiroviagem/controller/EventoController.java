package br.edu.infnet.approteiroviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.approteiroviagem.model.domain.Evento;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.EventoService;

@Controller
public class EventoController{
	@Autowired
	private EventoService eventoService;	
	
	@GetMapping(value="/evento/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		model.addAttribute("listagem", eventoService.obterLista(usuario));
		
		return "evento/lista";
	}
	
	@GetMapping(value="evento")
	public String telaCadastro() {
		return "evento/cadastro";
	}
	
	@GetMapping(value="/evento/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		eventoService.excluir(id);
		
		return "redirect:/evento/lista";
	}
	
	@PostMapping(value = "/evento/incluir")
	public String inclusao(Evento evento, @SessionAttribute("user") Usuario usuario) {
		evento.setUsuario(usuario);
		
		eventoService.incluir(evento);
		
		return "redirect:/evento/lista";
	}
}
