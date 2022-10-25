package br.edu.infnet.approteiroviagem;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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
		evento1.setValor(0);
		
		evento1.Horario = LocalDateTime.now();
		evento1.Duracao = 3;
		evento1.Local = "Praia de Copacabana";
		System.out.println(evento1.toString());
		
		// Evento 2
		Evento evento2 = new Evento();
		evento2.setCodigo(2);
		evento2.setNome("Maratona mundial");
		evento2.setValor(150.00f);
		
		evento2.Horario = LocalDateTime.now();
		evento2.Duracao = 2;
		evento2.Local = "Aterro do flamengo";
		System.out.println(evento2.toString());
		
		// Evento 3
		Evento evento3 = new Evento();
		evento3.setCodigo(3);
		evento3.setNome("Carnaval");
		evento3.setValor(300);
		
		evento3.Horario = LocalDateTime.now();
		evento3.Duracao = 4;
		evento3.Local = "Sapucaí";
		System.out.println(evento3.toString());
	}
}