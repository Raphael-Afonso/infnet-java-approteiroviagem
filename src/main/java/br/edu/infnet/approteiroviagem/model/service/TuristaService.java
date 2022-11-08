package br.edu.infnet.approteiroviagem.model.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.model.domain.Turista;
import br.edu.infnet.approteiroviagem.model.repository.TuristaRepository;

@Service
public class TuristaService {
	@Autowired 
	private TuristaRepository turistaRepository;
	
	public void incluir(Turista turista) {
		turistaRepository.save(turista);
	}
	
	public void excluir(Integer id) {
		turistaRepository.deleteById(id);
	}
	
	public Collection<Turista> obterLista(){
		return (Collection<Turista>) turistaRepository.findAll();
	}
	
	public Optional<Turista> obterPorId(Integer id){
		return turistaRepository.findById(id);
	}
}
