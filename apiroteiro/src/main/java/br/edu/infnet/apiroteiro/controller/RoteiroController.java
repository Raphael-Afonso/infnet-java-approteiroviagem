package br.edu.infnet.apiroteiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiroteiro.model.domain.Roteiro;
import br.edu.infnet.apiroteiro.model.service.RoteiroService;

@RestController
@RequestMapping("/api/roteiro")
public class RoteiroController {
	@Autowired
	private RoteiroService roteiroService;
	
	@PostMapping("/incluir")
	public void incluir(@RequestBody Roteiro roteiro) {
		roteiroService.incluir(roteiro);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		roteiroService.excluir(id);
	}
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Roteiro> obterLista(@PathVariable Integer idUsuario){
		return roteiroService.obterLista(idUsuario);
	}
}
