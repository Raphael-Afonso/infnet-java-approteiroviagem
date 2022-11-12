package br.edu.infnet.approteiroviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.approteiroviagem.model.domain.Turista;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.TuristaService;

@Controller
public class TuristaController {
	@Autowired
	private TuristaService turistaService;

	@GetMapping(value="/turista/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", turistaService.obterLista(usuario));

		return "turista/lista";
	}
	
	@GetMapping(value = "turista")
	public String telaCadastro() {
		return "turista/cadastro";
	}
	
	@GetMapping(value="/turista/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		turistaService.excluir(id);
		
		return "redirect:/turista/lista";
	}
	
	@PostMapping(value = "/turista/incluir")
	public String inclusao(Turista turista, @SessionAttribute("user") Usuario usuario)
	{
		turista.setUsuario(usuario);
		
		turistaService.incluir(turista);
		
		return "redirect:/turista/lista";
	}
}
