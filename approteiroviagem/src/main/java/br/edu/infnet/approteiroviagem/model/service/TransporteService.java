package br.edu.infnet.approteiroviagem.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.model.domain.Transporte;
import br.edu.infnet.approteiroviagem.model.repository.TransporteRepository;

@Service
public class TransporteService {
	@Autowired 
	private TransporteRepository transporteRepository;
	
	public void incluir(Transporte transporte) {
		transporteRepository.save(transporte);
	}
	
	public void excluir(Integer id) {
		transporteRepository.deleteById(id);
	}
	
	public Collection<Transporte> obterLista(){
		return (Collection<Transporte>) transporteRepository.findAll();
	}
	
	public Optional<Transporte> obterPorId(Integer id){
		return transporteRepository.findById(id);
	}
}
