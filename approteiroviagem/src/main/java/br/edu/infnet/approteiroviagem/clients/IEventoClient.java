package br.edu.infnet.approteiroviagem.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.approteiroviagem.model.domain.Evento;

@FeignClient(url = "localhost:8084/api/evento", name = "eventoClient")
public interface IEventoClient {
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Evento evento);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Evento> obterLista(@PathVariable Integer idUsuario);
}
