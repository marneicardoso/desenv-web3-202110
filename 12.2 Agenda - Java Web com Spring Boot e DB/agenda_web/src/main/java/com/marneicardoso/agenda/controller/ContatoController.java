package com.marneicardoso.agenda.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marneicardoso.agenda.model.Agenda;
import com.marneicardoso.agenda.model.Contato;

@Controller
public class ContatoController {

	@PostMapping("/cadastrarContato")
	public String cadastrarContato(Model model, Contato contato) {
		
		Agenda agenda = new Agenda();
		
		try {
			String mensagem = agenda.cadastrarContato(contato);
			model.addAttribute("mensagem", mensagem);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "cadastro";
	}
	
	@RequestMapping("/buscarContato")
	public String buscarContato(Model model) {
		
		Agenda agenda = new Agenda();
		try {
			List<Contato> listaDeContatos = new ArrayList<Contato>();
			listaDeContatos = agenda.buscarContato(0);

			if (listaDeContatos.size() < 1) {
				model.addAttribute("resultado", "Nenhum contato registrado");
				return "contato";
			}
			
			// Guarda a lista preenchida no Model
			model.addAttribute("contatos", listaDeContatos);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "contato";
	}
}





