package br.edu.infnet.approteiroviagem;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.controller.TransporteController;
import br.edu.infnet.approteiroviagem.model.domain.Transporte;

@Component
public class TransporteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de transportes ###");
		
		// Transporte 1
		Transporte transporte1 = new Transporte();
		transporte1.setCodigo(7);
		transporte1.setNome("Translado Galeão - Hilton");
		transporte1.setValor(80);
		
		transporte1.setVeiculo("Onibus");
		transporte1.setEnderecoEmbarque("Aeroporto Galeão - Terminal 1");
		transporte1.setEnderecoDesembarque("Hotel Hilton Copacabana");
		System.out.println(transporte1.toString());
		TransporteController.incluir(transporte1);
		
		//Transporte 2
		Transporte transporte2 = new Transporte();
		transporte2.setCodigo(8);
		transporte2.setNome("Vôo São Paulo - Rio de Janeiro");
		transporte2.setValor(800);
		
		transporte2.setVeiculo("Avião");
		transporte2.setEnderecoEmbarque("Aeroporto de Guarulhos");
		transporte2.setEnderecoDesembarque("Aeroporto Santos Dumont");
		System.out.println(transporte2.toString());
		TransporteController.incluir(transporte2);
		
		// Transporte 3
		Transporte transporte3 = new Transporte();
		transporte3.setCodigo(9);
		transporte3.setNome("Taxi Sambódromo");
		transporte3.setValor(120);
		
		transporte3.setVeiculo("Carro");
		transporte3.setEnderecoEmbarque("Copacabana Palace");
		transporte3.setEnderecoDesembarque("Sambódromo");
		System.out.println(transporte3.toString());
		TransporteController.incluir(transporte3);
	}

}