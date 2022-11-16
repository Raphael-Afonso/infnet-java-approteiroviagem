package br.edu.infnet.approteiroviagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.clients.IHospedagemClient;
import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;

@Service
public class HospedagemService {
	@Autowired 
	private IHospedagemClient hospedagemClient;
	
	public void incluir(Hospedagem hospedagem) {
		hospedagemClient.incluir(hospedagem);
	}
	
	public void excluir(Integer id) {
		hospedagemClient.excluir(id);
	}
	
	public List<Hospedagem> obterLista(Usuario usuario){
		return hospedagemClient.obterLista(usuario.getId());
	}
}
