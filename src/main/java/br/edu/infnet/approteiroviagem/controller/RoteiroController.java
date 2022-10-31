package br.edu.infnet.approteiroviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.approteiroviagem.model.domain.Roteiro;

@Controller
public class RoteiroController {
	private static Map<Integer, Roteiro> mapa = new HashMap<Integer, Roteiro>();
	private static Integer id = 1;
	
	public static void incluir(Roteiro roteiro) {
		roteiro.setId(id++);
		
		mapa.put(roteiro.getId(), roteiro);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Roteiro> obterLista(){
		return mapa.values();
	}

	@GetMapping(value="/roteiro/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		
		return "roteiro/lista";
	}
	
	@GetMapping(value="/roteiro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/roteiro/lista";
	}
}
