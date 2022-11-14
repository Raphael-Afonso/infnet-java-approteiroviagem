package br.edu.infnet.apiservico.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiservico.model.domain.Transporte;
import br.edu.infnet.apiservico.model.repository.TransporteRepository;

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
	
	public List<Transporte> obterLista(){
		return (List<Transporte>) transporteRepository.findAll();
	}
	
	public List<Transporte> obterLista(Integer idUsuario){
		return (List<Transporte>) transporteRepository.obterLista(idUsuario);
	}
}
