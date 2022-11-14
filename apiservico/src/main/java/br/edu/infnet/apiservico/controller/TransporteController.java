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

import br.edu.infnet.apiservico.model.domain.Transporte;
import br.edu.infnet.apiservico.model.service.TransporteService;

@RestController
@RequestMapping("/api/transporte")
public class TransporteController {
	@Autowired
	private TransporteService transporteService;
	
	@PostMapping("/incluir")
	public void incluir(@RequestBody Transporte transporte) {
		transporteService.incluir(transporte);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		transporteService.excluir(id);
	}
	
	@GetMapping(value = "/{idUsuario}/listar")
	public List<Transporte> obterLista(@PathVariable Integer idUsuario){
		return transporteService.obterLista(idUsuario);
	}
}
