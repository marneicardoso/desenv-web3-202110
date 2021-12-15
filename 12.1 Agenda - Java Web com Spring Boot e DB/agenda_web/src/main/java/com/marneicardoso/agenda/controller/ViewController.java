package com.marneicardoso.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
	@RequestMapping("/contato")
	public String contato() {
		return "contato";
	}
}
