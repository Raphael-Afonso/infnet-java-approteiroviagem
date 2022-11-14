package br.edu.infnet.approteiroviagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.HospedagemService;

@Order(5)
@Component
public class HospedagemTeste implements ApplicationRunner{
	
	@Autowired
	private HospedagemService hospedagemService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de hospedagens ###");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		// Hospedagem 1
		Hospedagem hospedagem1 = new Hospedagem();
		hospedagem1.setFornecedor("Acme eventos");
		hospedagem1.setNome("Hospedagem no Widsor");
		hospedagem1.setValor(550);
		
		hospedagem1.setEstrelas(4);
		hospedagem1.setTotalQuartos(50);
		hospedagem1.setEmpresa("Widsor");
		hospedagem1.setUsuario(usuario);
		System.out.println(hospedagem1.toString());
		hospedagemService.incluir(hospedagem1);
				
		// Hospedagem 2
		Hospedagem hospedagem2 = new Hospedagem();
		hospedagem2.setFornecedor("Xpto eventos");
		hospedagem2.setNome("Hospedagem no Hilton");
		hospedagem2.setValor(600);
		
		hospedagem2.setEstrelas(4);
		hospedagem2.setTotalQuartos(120);
		hospedagem2.setEmpresa("Hilton");
		hospedagem2.setUsuario(usuario);
		System.out.println(hospedagem2.toString());
		hospedagemService.incluir(hospedagem2);
		
		// Hospedagem 3
		Hospedagem hospedagem3 = new Hospedagem();
		hospedagem3.setFornecedor("Xyz eventos");
		hospedagem3.setNome("Hospedagem no Ibis");
		hospedagem3.setValor(250);
		
		hospedagem3.setEstrelas(3);
		hospedagem3.setTotalQuartos(65);
		hospedagem3.setEmpresa("Ibis");
		hospedagem3.setUsuario(usuario);
		System.out.println(hospedagem3.toString());
		hospedagemService.incluir(hospedagem3);
	}
}