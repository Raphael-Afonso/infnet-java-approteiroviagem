package br.edu.infnet.approteiroviagem.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.approteiroviagem.model.domain.Evento;

@Controller
public class EventoController {

	@GetMapping(value="/evento/lista")
	public String telaLista(Model model) {
		Evento evento1 = new Evento();
		evento1.setCodigo(1);
		evento1.setNome("Show da virada do ano");
		evento1.setValor(0);		
		evento1.setHorario(LocalDateTime.now());
		evento1.setDuracao(3);
		evento1.setLocal("Praia de Copacabana");
		
		// Evento 2
		Evento evento2 = new Evento();
		evento2.setCodigo(2);
		evento2.setNome("Maratona mundial");
		evento2.setValor(150.00f);		
		evento2.setHorario(LocalDateTime.now());
		evento2.setDuracao(2);
		evento2.setLocal("Aterro do flamengo");
		System.out.println(evento2.toString());
		
		// Evento 3
		Evento evento3 = new Evento();
		evento3.setCodigo(3);
		evento3.setNome("Carnaval");
		evento3.setValor(300);		
		evento3.setHorario(LocalDateTime.now());
		evento3.setDuracao(4);
		evento3.setLocal("Sapucaí");
		
		List<Evento> eventos = new ArrayList<Evento>();
		eventos.add(evento1);
		eventos.add(evento2);
		eventos.add(evento3);
		
		model.addAttribute("listagem", eventos);
		
		return "evento/lista";
	}
}
