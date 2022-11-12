package br.edu.infnet.approteiroviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.approteiroviagem.model.domain.Roteiro;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.RoteiroService;
import br.edu.infnet.approteiroviagem.model.service.ServicoService;
import br.edu.infnet.approteiroviagem.model.service.TuristaService;

@Controller
public class RoteiroController {
	@Autowired
	private RoteiroService roteiroService;
	@Autowired
	private ServicoService servicoService;
	@Autowired
	private TuristaService turistaService;

	@GetMapping(value="/roteiro/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", roteiroService.obterLista());

		return "roteiro/lista";
	}

	@GetMapping(value = "/roteiro")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("turistas", turistaService.obterLista(usuario));

		model.addAttribute("servicos", servicoService.obterLista(usuario));
		
		return "roteiro/cadastro";
	}

	@PostMapping(value = "/roteiro/incluir")
	public String incluir(Roteiro roteiro, @SessionAttribute("user") Usuario usuario) {
		
		roteiro.setUsuario(usuario);
		
		roteiroService.incluir(roteiro);
		
		return "redirect:/roteiro/lista";
	}	
	
	@GetMapping(value="/roteiro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		roteiroService.excluir(id);

		return "redirect:/roteiro/lista";
	}
}
