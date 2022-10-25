package br.edu.infnet.approteiroviagem;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;

@Component
public class HospedagemTeste implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de hospedagens ###");
		
		// Hospedagem 1
		Hospedagem hospedagem1 = new Hospedagem();
		hospedagem1.setCodigo(4);
		hospedagem1.setNome("Hospedagem no Widsor");
		hospedagem1.setValor(550);
		
		hospedagem1.Estrelas = 4;
		hospedagem1.TotalQuartos = 50;
		hospedagem1.Empresa = "Widsor";
		System.out.println(hospedagem1.toString());
				
		// Hospedagem 2
		Hospedagem hospedagem2 = new Hospedagem();
		hospedagem2.setCodigo(5);
		hospedagem2.setNome("Hospedagem no Hilton");
		hospedagem2.setValor(600);
		
		hospedagem2.Estrelas = 4;
		hospedagem2.TotalQuartos = 120;
		hospedagem2.Empresa = "Hilton";
		System.out.println(hospedagem2.toString());
		
		// Hospedagem 3
		Hospedagem hospedagem3 = new Hospedagem();
		hospedagem3.setCodigo(6);
		hospedagem3.setNome("Hospedagem no Ibis");
		hospedagem3.setValor(250);
		
		hospedagem3.Estrelas = 3;
		hospedagem3.TotalQuartos = 65;
		hospedagem3.Empresa = "Ibis";
		System.out.println(hospedagem3.toString());
	}
}