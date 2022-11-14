package br.edu.infnet.apiservico.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiservico.model.domain.Hospedagem;
import br.edu.infnet.apiservico.model.repository.HospedagemRepository;

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
	
	public List<Hospedagem> obterLista(){
		return (List<Hospedagem>) hospedagemRepository.findAll();
	}
	
	public List<Hospedagem> obterLista(Integer idUsuario){
		return (List<Hospedagem>) hospedagemRepository.obterLista(idUsuario);
	}
}
