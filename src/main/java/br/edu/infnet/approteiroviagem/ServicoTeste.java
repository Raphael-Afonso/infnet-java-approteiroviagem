package br.edu.infnet.approteiroviagem;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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
		
		transporte1.Veiculo = "Onibus";
		transporte1.EnderecoEmbarque = "Aeroporto Galeão - Terminal 1";
		transporte1.EnderecoDesembarque = "Hotel Hilton Copacabana";
		System.out.println(transporte1.toString());
		
		Evento evento1 = new Evento();
		evento1.setCodigo(1);
		evento1.setNome("Show da virada do ano");
		evento1.setValor(0);
		
		evento1.Horario = LocalDateTime.now();
		evento1.Duracao = 3;
		evento1.Local = "Praia de Copacabana";
		System.out.println(evento1.toString());
		
		Hospedagem hospedagem1 = new Hospedagem();
		hospedagem1.setCodigo(4);
		hospedagem1.setNome("Hospedagem no Widsor");
		hospedagem1.setValor(550);
		
		hospedagem1.Estrelas = 4;
		hospedagem1.TotalQuartos = 50;
		hospedagem1.Empresa = "Widsor";
		System.out.println(hospedagem1.toString());
	}
}
