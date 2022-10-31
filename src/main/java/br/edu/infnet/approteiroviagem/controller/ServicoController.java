package br.edu.infnet.approteiroviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.approteiroviagem.model.domain.Servico;

@Controller
public class ServicoController {
	private static Map<Integer, Servico> mapa = new HashMap<Integer, Servico>();
	private static Integer id = 1;
	
	public static void incluir(Servico servico) {
		servico.setId(id++);
		
		mapa.put(servico.getId(), servico);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Servico> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value="/servico/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		
		return "servico/lista";
	}
	
	@GetMapping(value="/servico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/servico/lista";
	}
}