package br.edu.infnet.approteiroviagem.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.model.domain.Roteiro;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;
import br.edu.infnet.approteiroviagem.model.repository.RoteiroRepository;

@Service
public class RoteiroService {
	@Autowired 
	private RoteiroRepository roteiroRepository;
	
	public void incluir(Roteiro roteiro) {
		roteiroRepository.save(roteiro);
	}
	
	public void excluir(Integer id) {
		roteiroRepository.deleteById(id);
	}
	
	public Collection<Roteiro> obterLista(){
		return (Collection<Roteiro>) roteiroRepository.findAll();
	}
	
	public Collection<Roteiro> obterLista(Usuario usuario){
		return (Collection<Roteiro>) roteiroRepository.obterLista(usuario.getId());
	}
}
