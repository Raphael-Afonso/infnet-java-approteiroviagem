package br.edu.infnet.approteiroviagem;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.controller.ServicoController;
import br.edu.infnet.approteiroviagem.model.domain.Evento;
import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;
import br.edu.infnet.approteiroviagem.model.domain.Transporte;

@Component
public class ServicoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de serviços ###");
		
		Transporte transporte1 = new Transporte();
		transporte1.setCodigo(7);
		transporte1.setNome("Translado Galeão - Hilton");
		transporte1.setValor(80);
		
		transporte1.setVeiculo("Onibus");
		transporte1.setEnderecoEmbarque("Aeroporto Galeão - Terminal 1");
		transporte1.setEnderecoDesembarque("Hotel Hilton Copacabana");
		System.out.println(transporte1.toString());
		ServicoController.incluir(transporte1);
		
		Evento evento1 = new Evento();
		evento1.setCodigo(1);
		evento1.setNome("Show da virada do ano");
		evento1.setValor(0);
		
		evento1.setHorario(LocalDateTime.now());
		evento1.setDuracao(3);
		evento1.setLocal("Praia de Copacabana");
		System.out.println(evento1.toString());
		ServicoController.incluir(evento1);
		
		Hospedagem hospedagem1 = new Hospedagem();
		hospedagem1.setCodigo(4);
		hospedagem1.setNome("Hospedagem no Widsor");
		hospedagem1.setValor(550);
		
		hospedagem1.setEstrelas(4);
		hospedagem1.setTotalQuartos(50);
		hospedagem1.setEmpresa("Widsor");
		System.out.println(hospedagem1.toString());
		ServicoController.incluir(hospedagem1);
	}
}
