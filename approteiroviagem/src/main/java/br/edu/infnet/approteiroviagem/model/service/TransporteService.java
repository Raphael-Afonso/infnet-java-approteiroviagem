package br.edu.infnet.approteiroviagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.approteiroviagem.clients.ITransporteClient;
import br.edu.infnet.approteiroviagem.model.domain.Transporte;
import br.edu.infnet.approteiroviagem.model.domain.Usuario;

@Service
public class TransporteService {
	@Autowired 
	private ITransporteClient transporteClient;
	
	public void incluir(Transporte transporte) {
		transporteClient.incluir(transporte);
	}
	
	public void excluir(Integer id) {
		transporteClient.excluir(id);
	}
	
	public List<Transporte> obterLista(Usuario usuario){
		return transporteClient.obterLista(usuario.getId());
	}
}
