package br.edu.infnet.approteiroviagem.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;

@FeignClient(url = "localhost:8084/api/hospedagem", name = "hospedagemClient")
public interface IHospedagemClient {
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Hospedagem hospedagem);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Hospedagem> obterLista(@PathVariable Integer idUsuario);
}
