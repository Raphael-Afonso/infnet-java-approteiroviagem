package br.edu.infnet.apiservico.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiservico.model.domain.Evento;
import br.edu.infnet.apiservico.model.repository.EventoRepository;

@Service
public class EventoService {
	@Autowired 
	private EventoRepository eventoRepository;
	
	public void incluir(Evento evento) {
		eventoRepository.save(evento);
	}
	
	public void excluir(Integer id) {
		eventoRepository.deleteById(id);
	}
	
	public List<Evento> obterLista(){
		return (List<Evento>) eventoRepository.findAll();
	}
	
	public List<Evento> obterLista(Integer idUsuario){
		return (List<Evento>) eventoRepository.obterLista(idUsuario);
	}
}
