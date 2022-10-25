package br.edu.infnet.approteiroviagem;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Roteiro;

@Component
public class RoteiroTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de roteiros ###");
		
		Roteiro roteiro1 = new Roteiro();
		roteiro1.Data = LocalDateTime.now();
		roteiro1.Descricao = "Rio de janeiro - cristo";
		roteiro1.Internacional = false;
		System.out.println(roteiro1.toString());
		
		Roteiro roteiro2 = new Roteiro();
		roteiro2.Data = LocalDateTime.now();
		roteiro2.Descricao = "Roma - Coliseu";
		roteiro2.Internacional = true;
		System.out.println(roteiro2.toString());
		
		Roteiro roteiro3 = new Roteiro();
		roteiro3.Data = LocalDateTime.now();
		roteiro3.Descricao = "Salvador - Pelourinho";
		roteiro3.Internacional = false;
		System.out.println(roteiro3.toString());
	}
}
