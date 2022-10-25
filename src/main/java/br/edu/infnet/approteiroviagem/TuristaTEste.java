package br.edu.infnet.approteiroviagem;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Turista;

@Component
public class TuristaTEste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de turistas ###");
		
		// Turista 1
		Turista viajante1 = new Turista();
		
		viajante1.Cpf = "1111111111";
		viajante1.Email = "joao@globo.com";
		viajante1.Nome = "João";
		System.out.println(viajante1.toString());
		
		// Turista 2
		Turista viajante2 = new Turista();
		viajante2.Cpf = "22222222222";
		viajante2.Email = "paulo@outlook.com";
		viajante2.Nome = "Paulo";
		System.out.println(viajante2.toString());
		
		// Turista 3
		Turista viajante3 = new Turista();
		viajante3.Cpf = "3333333333333";
		viajante3.Email = "arthur@gmail.com";
		viajante3.Nome = "Arthus";
		System.out.println(viajante3.toString());
	}

}