package br.edu.infnet.approteiroviagem;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Evento;
import br.edu.infnet.approteiroviagem.model.service.EventoService;

@Order(4)
@Component
public class EventoTeste implements ApplicationRunner{
	@Autowired
	private EventoService eventoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {		
		System.out.println("### Cadastramento de eventos ###");
		
		//Evento 1
		Evento evento1 = new Evento();
		evento1.setFornecedor("Abc eventos");
		evento1.setNome("Show da virada do ano");
		evento1.setValor(20);		
		evento1.setHorario(LocalDateTime.now());
		evento1.setDuracao(3);
		evento1.setLocal("Praia de Copacabana");
		System.out.println(evento1.toString());
		eventoService.incluir(evento1);
		
		// Evento 2
		Evento evento2 = new Evento();
		evento2.setFornecedor("Xpto eventos");
		evento2.setNome("Maratona mundial");
		evento2.setValor(150.00f);
		
		evento2.setHorario(LocalDateTime.now());
		evento2.setDuracao(2);
		evento2.setLocal("Aterro do flamengo");
		System.out.println(evento2.toString());
		eventoService.incluir(evento2);
		
		// Evento 3
		Evento evento3 = new Evento();
		evento3.setFornecedor("Acme eventos");
		evento3.setNome("Carnaval");
		evento3.setValor(300);
		
		evento3.setHorario(LocalDateTime.now());
		evento3.setDuracao(4);
		evento3.setLocal("Sapucaí");
		System.out.println(evento3.toString());
		eventoService.incluir(evento3);
	}
}