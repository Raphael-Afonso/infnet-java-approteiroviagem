package br.edu.infnet.approteiroviagem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appcontroller {

	@GetMapping(value="/")
	public String telaHome() {
		return "home";
	}
}
