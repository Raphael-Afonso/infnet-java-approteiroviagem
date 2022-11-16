package br.edu.infnet.approteiroviagem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;
import br.edu.infnet.approteiroviagem.model.domain.Roteiro;
import br.edu.infnet.approteiroviagem.model.domain.Servico;
import br.edu.infnet.approteiroviagem.model.domain.Transporte;
import br.edu.infnet.approteiroviagem.model.domain.Turista;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.RoteiroService;

@Order(7)
@Component
public class RoteiroTeste implements ApplicationRunner{
	@Autowired
	private RoteiroService roteiroService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de roteiros ###");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Hospedagem hospedagem = new Hospedagem();
		hospedagem.setId(4);
		
		Transporte transporte = new Transporte();
		transporte.setId(7);
		
		Turista turista = new Turista();
		turista.setId(1);
		
		List<Servico> servicosPrimeiroRoteiro = new ArrayList<Servico>();
		servicosPrimeiroRoteiro.add(hospedagem);
		servicosPrimeiroRoteiro.add(transporte);
		
		List<Servico> servicosDemaisRoteiros = new ArrayList<Servico>();
		servicosDemaisRoteiros.add(hospedagem);
		
		Roteiro roteiro1 = new Roteiro(turista);
		roteiro1.setDescricao("Rio de janeiro - cristo");
		roteiro1.setInternacional(false);
		roteiro1.setServicos(servicosPrimeiroRoteiro);
		roteiro1.setUsuario(usuario);
		System.out.println(roteiro1.toString());
		roteiroService.incluir(roteiro1);
		
		Roteiro roteiro2 = new Roteiro(turista);
		roteiro2.setDescricao("Roma - Coliseu");
		roteiro2.setInternacional(true);
		roteiro2.setServicos(servicosDemaisRoteiros);
		roteiro2.setUsuario(usuario);
		System.out.println(roteiro2.toString());
		roteiroService.incluir(roteiro2);
		
		Roteiro roteiro3 = new Roteiro(turista);
		roteiro3.setDescricao("Salvador - Pelourinho");
		roteiro3.setInternacional(false);
		roteiro3.setServicos(servicosDemaisRoteiros);
		roteiro3.setUsuario(usuario);
		System.out.println(roteiro3.toString());
		roteiroService.incluir(roteiro3);
	}
}
