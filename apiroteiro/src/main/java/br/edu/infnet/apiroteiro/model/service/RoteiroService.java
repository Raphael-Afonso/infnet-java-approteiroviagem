package br.edu.infnet.apiroteiro.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiroteiro.model.domain.Roteiro;
import br.edu.infnet.apiroteiro.model.repository.RoteiroRepository;

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
	
	public List<Roteiro> obterLista(){
		return (List<Roteiro>) roteiroRepository.findAll();
	}
	
	public List<Roteiro> obterLista(Integer idUsuario){
		return roteiroRepository.obterLista(idUsuario);
	}
}
