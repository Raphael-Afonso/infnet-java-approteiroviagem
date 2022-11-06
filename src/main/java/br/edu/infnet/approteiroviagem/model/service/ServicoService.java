package br.edu.infnet.approteiroviagem.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.model.domain.Servico;
import br.edu.infnet.approteiroviagem.model.repository.ServicoRepository;

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
	
	public Collection<Servico> obterLista(){
		return (Collection<Servico>) servicoRepository.findAll();
	}
	
	public Optional<Servico> obterPorId(Integer id){
		return servicoRepository.findById(id);
	}
}
