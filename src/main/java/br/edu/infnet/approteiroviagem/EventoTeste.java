package br.edu.infnet.approteiroviagem;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.controller.EventoController;
import br.edu.infnet.approteiroviagem.model.domain.Evento;

@Component
public class EventoTeste implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de eventos ###");
		
		//Evento 1
		Evento evento1 = new Evento();
		evento1.setCodigo(1);
		evento1.setNome("Show da virada do ano");
		evento1.setValor(20);		
		evento1.setHorario(LocalDateTime.now());
		evento1.setDuracao(3);
		evento1.setLocal("Praia de Copacabana");
		System.out.println(evento1.toString());
		EventoController.incluir(evento1);
		
		// Evento 2
		Evento evento2 = new Evento();
		evento2.setCodigo(2);
		evento2.setNome("Maratona mundial");
		evento2.setValor(150.00f);
		
		evento2.setHorario(LocalDateTime.now());
		evento2.setDuracao(2);
		evento2.setLocal("Aterro do flamengo");
		System.out.println(evento2.toString());
		EventoController.incluir(evento2);
		
		// Evento 3
		Evento evento3 = new Evento();
		evento3.setCodigo(3);
		evento3.setNome("Carnaval");
		evento3.setValor(300);
		
		evento3.setHorario(LocalDateTime.now());
		evento3.setDuracao(4);
		evento3.setLocal("Sapucaí");
		System.out.println(evento3.toString());
		EventoController.incluir(evento3);
	}
}