package br.edu.infnet.approteiroviagem.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;
import br.edu.infnet.approteiroviagem.model.repository.HospedagemRepository;

@Service
public class HospedagemService {
	@Autowired 
	private HospedagemRepository hospedagemRepository;
	
	public void incluir(Hospedagem hospedagem) {
		hospedagemRepository.save(hospedagem);
	}
	
	public void excluir(Integer id) {
		hospedagemRepository.deleteById(id);
	}
	
	public Collection<Hospedagem> obterLista(){
		return (Collection<Hospedagem>) hospedagemRepository.findAll();
	}
	
	public Optional<Hospedagem> obterPorId(Integer id){
		return hospedagemRepository.findById(id);
	}
}
