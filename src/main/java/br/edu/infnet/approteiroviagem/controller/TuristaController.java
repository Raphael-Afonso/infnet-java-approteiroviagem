package br.edu.infnet.approteiroviagem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.approteiroviagem.model.domain.Turista;

@Controller
public class TuristaController {

	@GetMapping(value="/turista/lista")
	public String telaLista(Model model) {
		// Turista 1
		Turista turista1 = new Turista();		
		turista1.setCpf("1111111111");
		turista1.setEmail("joao@globo.com");
		turista1.setNome("João");
		
		// Turista 2
		Turista turista2 = new Turista();		
		turista2.setCpf("22222222222");
		turista2.setEmail("paulo@outlook.com");
		turista2.setNome("Paulo");
		
		// Turista 3
		Turista turista3 = new Turista();		
		turista3.setCpf("3333333333333");
		turista3.setEmail("arthur@gmail.com");
		turista3.setNome("Arthus");
		
		List<Turista> turistas = new ArrayList<Turista>();
		turistas.add(turista1);
		turistas.add(turista2);
		turistas.add(turista3);
		
		model.addAttribute("listagem", turistas);

		return "turista/lista";
	}
}
