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

import br.edu.infnet.apiservico.model.domain.Evento;
import br.edu.infnet.apiservico.model.service.EventoService;

@RestController
@RequestMapping("/api/evento")
public class EventoController {
	@Autowired
	private EventoService eventoService;
	
	@PostMapping("/incluir")
	public void incluir(@RequestBody Evento evento) {
		eventoService.incluir(evento);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		eventoService.excluir(id);
	}
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Evento> obterLista(@PathVariable Integer idUsuario){
		return eventoService.obterLista(idUsuario);
	}
}
