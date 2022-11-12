package br.edu.infnet.approteiroviagem.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.clients.IEnderecoClient;
import br.edu.infnet.approteiroviagem.clients.IUsuarioClient;
import br.edu.infnet.approteiroviagem.model.domain.Endereco;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;

@Service
public class UsuarioService {
	@Autowired 
	private IUsuarioClient usuarioClient;

	@Autowired
	private IEnderecoClient enderecoClient;
	
	public void incluir(Usuario usuario) {
		usuarioClient.incluir(usuario);
	}
	
	public void excluir(Integer id) {
		usuarioClient.excluir(id);
	}
	
	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioClient.obterLista();
	}
	
	public Usuario validar(String email, String senha) {
		return usuarioClient.validar(email, senha);
	}
	
	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}	
}
