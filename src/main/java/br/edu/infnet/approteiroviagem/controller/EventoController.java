package br.edu.infnet.approteiroviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.approteiroviagem.model.domain.Evento;

@Controller
public class EventoController{	
	public static void incluir(Evento evento) {
		evento.setId(id++);
		
		mapa.put(evento.getId(), evento);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Evento> obterLista(){
		return mapa.values();
	}
	
	private static Map<Integer, Evento> mapa = new HashMap<Integer, Evento>();
	private static Integer id = 1;
	
	@GetMapping(value="/evento/lista")
	public String telaLista(Model model) {		
		model.addAttribute("listagem", obterLista());
		
		return "evento/lista";
	}
	
	@GetMapping(value="/evento/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		
		return "redirect:/evento/lista";
	}
}
