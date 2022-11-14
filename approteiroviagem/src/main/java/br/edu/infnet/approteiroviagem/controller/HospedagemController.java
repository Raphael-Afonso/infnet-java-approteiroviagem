package br.edu.infnet.approteiroviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.HospedagemService;

@Controller
public class HospedagemController {
	@Autowired
	private HospedagemService hospedagemService;

	@GetMapping(value="/hospedagem/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", hospedagemService.obterLista(usuario));
		
		return "hospedagem/lista";
	}
	
	@GetMapping(value="hospedagem")
	public String telaCadastro() {
		return "hospedagem/cadastro";
	}
	
	@GetMapping(value="/hospedagem/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		hospedagemService.excluir(id);
		
		return "redirect:/hospedagem/lista";
	}
	
	@PostMapping(value = "/hospedagem/incluir")
	public String inclusao(Hospedagem hospedagem, @SessionAttribute("user") Usuario usuario) {
		hospedagem.setUsuario(usuario);
		
		hospedagemService.incluir(hospedagem);
		
		return "redirect:/hospedagem/lista";
	}
}
