package br.edu.infnet.approteiroviagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner{

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("### Cadastramento de usuários ###");
		
		// Usuario 1
		Usuario usuario1 = new Usuario();
		
		usuario1.setEmail("admin@admin.com");
		usuario1.setNome("Adm");
		usuario1.setSenha("123");
		System.out.println(usuario1.toString());
		usuarioService.incluir(usuario1);
		
		// Usuario 1
		Usuario usuario2 = new Usuario();
		
		usuario2.setEmail("raphael@admin.com");
		usuario2.setNome("raphael");
		usuario2.setSenha("123");
		System.out.println(usuario2.toString());
		usuarioService.incluir(usuario2);
	}
}