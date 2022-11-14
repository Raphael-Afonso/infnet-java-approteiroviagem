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

import br.edu.infnet.apiservico.model.domain.Hospedagem;
import br.edu.infnet.apiservico.model.service.HospedagemService;

@RestController
@RequestMapping("/api/hospedagem")
public class HospedagemController {
	@Autowired
	private HospedagemService hospedagemService;
	
	@PostMapping("/incluir")
	public void incluir(@RequestBody Hospedagem hospedagem) {
		hospedagemService.incluir(hospedagem);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		hospedagemService.excluir(id);
	}
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Hospedagem> obterLista(@PathVariable Integer idUsuario){
		return hospedagemService.obterLista(idUsuario);
	}
}
