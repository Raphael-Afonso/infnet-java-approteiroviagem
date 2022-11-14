package br.edu.infnet.approteiroviagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.clients.IEventoClient;
import br.edu.infnet.approteiroviagem.model.domain.Evento;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;

@Service
public class EventoService {
	@Autowired 
	private IEventoClient eventoClient;
	
	public void incluir(Evento evento) {
		eventoClient.incluir(evento);
	}
	
	public void excluir(Integer id) {
		eventoClient.excluir(id);
	}
	
	public List<Evento> obterLista(Usuario usuario){
		return eventoClient.obterLista(usuario.getId());
	}
}
