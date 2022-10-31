package br.edu.infnet.approteiroviagem.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.approteiroviagem.model.domain.Evento;
import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;
import br.edu.infnet.approteiroviagem.model.domain.Roteiro;
import br.edu.infnet.approteiroviagem.model.domain.Servico;
import br.edu.infnet.approteiroviagem.model.domain.Transporte;
import br.edu.infnet.approteiroviagem.model.domain.Turista;

@Controller
public class RoteiroController {

	@GetMapping(value="/roteiro/lista")
	public String telaLista(Model model) {
		// Turista
		Turista turista1 = new Turista();		
		turista1.setCpf("1111111111");
		turista1.setEmail("joao@globo.com");
		turista1.setNome("João");
		
		// Serviços
		Transporte transporte1 = new Transporte();
		transporte1.setCodigo(7);
		transporte1.setNome("Translado Galeão - Hilton");
		transporte1.setValor(80);
		transporte1.setVeiculo("Onibus");
		transporte1.setEnderecoEmbarque("Aeroporto Galeão - Terminal 1");
		transporte1.setEnderecoDesembarque("Hotel Hilton Copacabana");
		
		Evento evento1 = new Evento();
		evento1.setCodigo(1);
		evento1.setNome("Show da virada do ano");
		evento1.setValor(0);
		evento1.setHorario(LocalDateTime.now());
		evento1.setDuracao(3);
		evento1.setLocal("Praia de Copacabana");
		
		Hospedagem hospedagem1 = new Hospedagem();
		hospedagem1.setCodigo(4);
		hospedagem1.setNome("Hospedagem no Widsor");
		hospedagem1.setValor(550);		
		hospedagem1.setEstrelas(4);
		hospedagem1.setTotalQuartos(50);
		hospedagem1.setEmpresa("Widsor");
		
		// Roteiros
		List<Servico> servicosPrimeiroRoteiro = new ArrayList<Servico>();
		servicosPrimeiroRoteiro.add(hospedagem1);
		servicosPrimeiroRoteiro.add(transporte1);
		List<Servico> servicosDemaisRoteiros = new ArrayList<Servico>();
		servicosDemaisRoteiros.add(hospedagem1);
		servicosDemaisRoteiros.add(transporte1);
		servicosDemaisRoteiros.add(evento1);
		
		Roteiro roteiro1 = new Roteiro(turista1);
		roteiro1.setDescricao("Rio de janeiro - cristo");
		roteiro1.setInternacional(false);
		roteiro1.setServicos(servicosPrimeiroRoteiro);
		
		Roteiro roteiro2 = new Roteiro(turista1);
		roteiro2.setDescricao("Roma - Coliseu");
		roteiro2.setInternacional(true);
		roteiro2.setServicos(servicosDemaisRoteiros);
		
		Roteiro roteiro3 = new Roteiro(turista1);
		roteiro3.setDescricao("Salvador - Pelourinho");
		roteiro3.setInternacional(false);
		roteiro3.setServicos(servicosDemaisRoteiros);
		
		List<Roteiro> roteiros = new ArrayList<Roteiro>();
		roteiros.add(roteiro1);
		roteiros.add(roteiro2);
		roteiros.add(roteiro3);
		
		model.addAttribute("listagem", roteiros);
		
		return "roteiro/lista";
	}
}
