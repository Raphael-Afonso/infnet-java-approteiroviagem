package br.edu.infnet.approteiroviagem.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.model.domain.Evento;
import br.edu.infnet.approteiroviagem.model.repository.EventoRepository;

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
	
	public Collection<Evento> obterLista(){
		return (Collection<Evento>) eventoRepository.findAll();
	}
	
	public Optional<Evento> obterPorId(Integer id){
		return eventoRepository.findById(id);
	}
}
