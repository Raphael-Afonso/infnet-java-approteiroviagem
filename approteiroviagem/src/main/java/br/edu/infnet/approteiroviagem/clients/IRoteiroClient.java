package br.edu.infnet.approteiroviagem.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.approteiroviagem.model.domain.Roteiro;

@FeignClient(url = "localhost:8085/api/roteiro", name = "roteiroClient")
public interface IRoteiroClient {
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Roteiro roteiro);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Roteiro> obterLista(@PathVariable Integer idUsuario);
}
