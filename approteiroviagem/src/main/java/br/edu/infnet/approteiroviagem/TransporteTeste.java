package br.edu.infnet.approteiroviagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Transporte;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.TransporteService;

@Order(6)
@Component
public class TransporteTeste implements ApplicationRunner{
	@Autowired
	private TransporteService transporteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de transportes ###");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		// Transporte 1
		Transporte transporte1 = new Transporte();
		transporte1.setFornecedor("Viação cometa");
		transporte1.setNome("Translado Galeão - Hilton");
		transporte1.setValor(80);
		
		transporte1.setVeiculo("Onibus");
		transporte1.setEnderecoEmbarque("Aeroporto Galeão - Terminal 1");
		transporte1.setEnderecoDesembarque("Hotel Hilton Copacabana");
		transporte1.setUsuario(usuario);
		System.out.println(transporte1.toString());
		transporteService.incluir(transporte1);
		
		//Transporte 2
		Transporte transporte2 = new Transporte();
		transporte2.setFornecedor("Azul");
		transporte2.setNome("Vôo São Paulo - Rio de Janeiro");
		transporte2.setValor(800);
		
		transporte2.setVeiculo("Avião");
		transporte2.setEnderecoEmbarque("Aeroporto de Guarulhos");
		transporte2.setEnderecoDesembarque("Aeroporto Santos Dumont");
		transporte2.setUsuario(usuario);
		System.out.println(transporte2.toString());
		transporteService.incluir(transporte2);
		
		// Transporte 3
		Transporte transporte3 = new Transporte();
		transporte3.setFornecedor("Taxi Rio");
		transporte3.setNome("Taxi Sambódromo");
		transporte3.setValor(120);
		
		transporte3.setVeiculo("Carro");
		transporte3.setEnderecoEmbarque("Copacabana Palace");
		transporte3.setEnderecoDesembarque("Sambódromo");
		transporte3.setUsuario(usuario);
		System.out.println(transporte3.toString());
		transporteService.incluir(transporte3);
	}

}