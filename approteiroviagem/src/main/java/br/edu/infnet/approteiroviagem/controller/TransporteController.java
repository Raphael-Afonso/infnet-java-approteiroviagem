package br.edu.infnet.approteiroviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.TransporteService;

@Controller
public class TransporteController {
	@Autowired
	private TransporteService transporteService;
	
	@GetMapping(value="/transporte/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {	
		model.addAttribute("listagem", transporteService.obterLista(usuario));
		
		return "transporte/lista";
	}
	
	@GetMapping(value="/transporte/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		transporteService.excluir(id);
		
		return "redirect:/transporte/lista";
	}
}
