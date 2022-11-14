package br.edu.infnet.apiservico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiservico.model.domain.Servico;
import br.edu.infnet.apiservico.model.service.ServicoService;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {
	@Autowired
	private ServicoService servicoService;
	
	@PostMapping("/incluir")
	public void incluir(@RequestBody Servico service) {
		servicoService.incluir(service);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		servicoService.excluir(id);
	}
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Servico> obterLista(@PathVariable Integer idUsuario){
		return servicoService.obterLista(idUsuario);
	}
}
