package br.edu.infnet.approteiroviagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.clients.IRoteiroClient;
import br.edu.infnet.approteiroviagem.model.domain.Roteiro;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;

@Service
public class RoteiroService {
	@Autowired 
	private IRoteiroClient roteiroClient;
	
	public void incluir(Roteiro roteiro) {
		roteiroClient.incluir(roteiro);
	}
	
	public void excluir(Integer id) {
		roteiroClient.excluir(id);
	}
	
	public List<Roteiro> obterLista(Usuario usuario){
		return roteiroClient.obterLista(usuario.getId());
	}
}