package br.edu.infnet.apiroteiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roteiro")
public class RoteiroController {
	@Autowired
	private RoteiroService roteiroService;
	
	@GetMapping("/listar")
	public List<Roteiro> obterLista(){
		return roteiroService.obterLista();
	}
}
