package br.edu.infnet.approteiroviagem.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;

@Controller
public class HospedagemController {
	private static Map<Integer, Hospedagem> mapa = new HashMap<Integer, Hospedagem>();
	private static Integer id = 1;
	
	public static void incluir(Hospedagem hospedagem) {
		hospedagem.setId(id++);
		
		mapa.put(hospedagem.getId(), hospedagem);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Hospedagem> obterLista(){
		return mapa.values();
	}

	@GetMapping(value="/hospedagem/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		
		return "hospedagem/lista";
	}
	
	@GetMapping(value="/hospedagem/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/hospedagem/lista";
	}
}
