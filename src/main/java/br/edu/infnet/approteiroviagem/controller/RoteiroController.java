package br.edu.infnet.approteiroviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.approteiroviagem.model.service.RoteiroService;

@Controller
public class RoteiroController {
	@Autowired
	private RoteiroService roteiroService;

	@GetMapping(value="/roteiro/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", roteiroService.obterLista());
		
		return "roteiro/lista";
	}
	
	@GetMapping(value="/roteiro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		roteiroService.excluir(id);
		
		return "redirect:/roteiro/lista";
	}
}
