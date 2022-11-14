package br.edu.infnet.apiservico.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiservico.model.domain.Servico;
import br.edu.infnet.apiservico.model.repository.ServicoRepository;

@Service
public class ServicoService {
	@Autowired
	private ServicoRepository servicoRepository;
	
	public void incluir(Servico servico) {
		servicoRepository.save(servico);
	}
	
	public void excluir(Integer id) {
		servicoRepository.deleteById(id);
	}
	
	public List<Servico> obterLista(){
		return (List<Servico>) servicoRepository.findAll();
	}
	
	public List<Servico> obterLista(Integer idUsuario){
		return (List<Servico>) servicoRepository.obterLista(idUsuario);
	}
}
