package br.edu.infnet.approteiroviagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.clients.IServicoClient;
import br.edu.infnet.approteiroviagem.model.domain.Servico;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;

@Service
public class ServicoService {
	@Autowired 
	private IServicoClient servicoClient;
	
	public void incluir(Servico servico) {
		servicoClient.incluir(servico);
	}
	
	public void excluir(Integer id) {
		servicoClient.excluir(id);
	}
	
	public List<Servico> obterLista(Usuario usuario){
		return servicoClient.obterLista(usuario.getId());
	}
}
