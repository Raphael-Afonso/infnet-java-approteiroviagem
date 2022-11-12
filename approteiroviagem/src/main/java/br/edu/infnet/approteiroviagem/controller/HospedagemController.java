package br.edu.infnet.approteiroviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.approteiroviagem.model.service.HospedagemService;

@Controller
public class HospedagemController {
	@Autowired
	private HospedagemService hospedagemService;

	@GetMapping(value="/hospedagem/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", hospedagemService.obterLista());
		
		return "hospedagem/lista";
	}
	
	@GetMapping(value="/hospedagem/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		hospedagemService.excluir(id);
		
		return "redirect:/hospedagem/lista";
	}
}