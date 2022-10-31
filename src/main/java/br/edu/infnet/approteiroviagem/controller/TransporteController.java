package br.edu.infnet.approteiroviagem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.approteiroviagem.model.domain.Transporte;

@Controller
public class TransporteController {

	@GetMapping(value="/transporte/lista")
	public String telaLista(Model model) {
		// Transporte 1
		Transporte transporte1 = new Transporte();
		transporte1.setCodigo(7);
		transporte1.setNome("Translado Galeão - Hilton");
		transporte1.setValor(80);		
		transporte1.setVeiculo("Onibus");
		transporte1.setEnderecoEmbarque("Aeroporto Galeão - Terminal 1");
		transporte1.setEnderecoDesembarque("Hotel Hilton Copacabana");
		
		//Transporte 2
		Transporte transporte2 = new Transporte();
		transporte2.setCodigo(8);
		transporte2.setNome("Vôo São Paulo - Rio de Janeiro");
		transporte2.setValor(800);		
		transporte2.setVeiculo("Avião");
		transporte2.setEnderecoEmbarque("Aeroporto de Guarulhos");
		transporte2.setEnderecoDesembarque("Aeroporto Santos Dumont");
		
		// Transporte 3
		Transporte transporte3 = new Transporte();
		transporte3.setCodigo(9);
		transporte3.setNome("Taxi Sambódromo");
		transporte3.setValor(120);		
		transporte3.setVeiculo("Carro");
		transporte3.setEnderecoEmbarque("Copacabana Palace");
		transporte3.setEnderecoDesembarque("Sambódromo");
		
		List<Transporte> transportes = new ArrayList<Transporte>();
		transportes.add(transporte1);
		transportes.add(transporte2);
		transportes.add(transporte3);
		
		model.addAttribute("listagem", transportes);
		
		return "transporte/lista";
	}
}
