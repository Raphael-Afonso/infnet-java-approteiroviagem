package br.edu.infnet.apiturista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiturista.model.domain.Turista;
import br.edu.infnet.apiturista.model.service.TuristaService;

@RestController
@RequestMapping("/api/turista")
public class TuristaController {
	@Autowired
	private TuristaService turistaService;
	
	@PostMapping("/incluir")
	public void incluir(@RequestBody Turista turista) {
		turistaService.incluir(turista);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		turistaService.excluir(id);
	}
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Turista> obterLista(@PathVariable Integer idUsuario){
		return turistaService.obterLista(idUsuario);
	}
}
