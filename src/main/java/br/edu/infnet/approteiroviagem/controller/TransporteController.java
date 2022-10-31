package br.edu.infnet.approteiroviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.approteiroviagem.model.domain.Transporte;

@Controller
public class TransporteController {
	private static Map<Integer, Transporte> mapa = new HashMap<Integer, Transporte>();
	private static Integer id = 1;
	
	public static void incluir(Transporte transporte) {
		transporte.setId(id++);
		
		mapa.put(transporte.getId(), transporte);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Transporte> obterLista(){
		return mapa.values();
	}

	@GetMapping(value="/transporte/lista")
	public String telaLista(Model model) {	
		model.addAttribute("listagem", obterLista());
		
		return "transporte/lista";
	}
	
	@GetMapping(value="/transporte/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/transporte/lista";
	}
}
