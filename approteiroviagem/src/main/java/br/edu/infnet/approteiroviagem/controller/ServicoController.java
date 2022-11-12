package br.edu.infnet.approteiroviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.approteiroviagem.model.domain.Servico;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.ServicoService;

@Controller
public class ServicoController {
	@Autowired
	private ServicoService servicoService;

	@GetMapping(value="/servico/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", servicoService.obterLista());
		
		return "servico/lista";
	}
	
	@GetMapping(value = "/servico")
	public String telaCadastro() {
		return "servico/cadastro";
	}
	
	@PostMapping(value = "/servico/incluir")
	public String incluir(Servico servico, @SessionAttribute("user") Usuario usuario) {
		
		servico.setUsuario(usuario);
		
		servicoService.incluir(servico);
		
		return "redirect:/servico/lista";
	}
	
	@GetMapping(value="/servico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		servicoService.excluir(id);
		
		return "redirect:/servico/lista";
	}
}
