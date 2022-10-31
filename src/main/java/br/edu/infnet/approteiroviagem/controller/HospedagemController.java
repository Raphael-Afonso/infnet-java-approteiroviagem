package br.edu.infnet.approteiroviagem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;

@Controller
public class HospedagemController {

	@GetMapping(value="/hospedagem/lista")
	public String telaLista(Model model) {
		// Hospedagem 1
		Hospedagem hospedagem1 = new Hospedagem();
		hospedagem1.setCodigo(4);
		hospedagem1.setNome("Hospedagem no Widsor");
		hospedagem1.setValor(550);
		hospedagem1.setEstrelas(4);
		hospedagem1.setTotalQuartos(50);
		hospedagem1.setEmpresa("Widsor");
				
		// Hospedagem 2
		Hospedagem hospedagem2 = new Hospedagem();
		hospedagem2.setCodigo(5);
		hospedagem2.setNome("Hospedagem no Hilton");
		hospedagem2.setValor(600);
		hospedagem2.setEstrelas(4);
		hospedagem2.setTotalQuartos(120);
		hospedagem2.setEmpresa("Hilton");
		
		// Hospedagem 3
		Hospedagem hospedagem3 = new Hospedagem();
		hospedagem3.setCodigo(6);
		hospedagem3.setNome("Hospedagem no Ibis");
		hospedagem3.setValor(250);
		hospedagem3.setEstrelas(3);
		hospedagem3.setTotalQuartos(65);
		hospedagem3.setEmpresa("Ibis");

		List<Hospedagem> hospedagens = new ArrayList<Hospedagem>();
		hospedagens.add(hospedagem1);
		hospedagens.add(hospedagem2);
		hospedagens.add(hospedagem3);
		
		model.addAttribute("listagem", hospedagens);
		
		return "hospedagem/lista";
	}
}
