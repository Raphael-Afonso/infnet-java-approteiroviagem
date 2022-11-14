package br.edu.infnet.approteiroviagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.clients.ITuristaClient;
import br.edu.infnet.approteiroviagem.model.domain.Turista;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;

@Service
public class TuristaService {
	@Autowired 
	private ITuristaClient turistaClient;
	
	public void incluir(Turista turista) {
		turistaClient.incluir(turista);
	}
	
	public void excluir(Integer id) {
		turistaClient.excluir(id);
	}
	
	public List<Turista> obterLista(Usuario usuario){
		return turistaClient.obterLista(usuario.getId());
	}
}
