package br.edu.infnet.approteiroviagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Turista;
import br.edu.infnet.approteiroviagem.model.service.TuristaService;

@Component
public class TuristaTeste implements ApplicationRunner{

	@Autowired
	private TuristaService turistaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de turistas ###");
		
		// Turista 1
		Turista turista1 = new Turista();
		
		turista1.setCpf("1111111111");
		turista1.setEmail("joao@globo.com");
		turista1.setNome("João");
		System.out.println(turista1.toString());
		turistaService.incluir(turista1);
		
		// Turista 2
		Turista turista2 = new Turista();
		
		turista2.setCpf("22222222222");
		turista2.setEmail("paulo@outlook.com");
		turista2.setNome("Paulo");
		System.out.println(turista2.toString());
		turistaService.incluir(turista2);
		
		// Turista 3
		Turista turista3 = new Turista();
		
		turista3.setCpf("3333333333333");
		turista3.setEmail("arthur@gmail.com");
		turista3.setNome("Arthus");
		System.out.println(turista3.toString());
		turistaService.incluir(turista3);
	}

}