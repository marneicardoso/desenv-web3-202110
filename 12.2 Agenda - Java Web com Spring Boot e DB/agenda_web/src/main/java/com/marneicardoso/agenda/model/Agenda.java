package com.marneicardoso.agenda.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Agenda {

	public String cadastrarContato(Contato contato) throws SQLException {
		// Valida os campos em branco
		if (contato.getNome().equals("")) {
			return "Preencha o campo nome";
		}
		
		if (contato.getEmail().equals("")) {
			return "Preencha o campo e-mail";
		}
		
		if (contato.getFone().equals("")) {
			return "Preencha o campo fone";
		}
				
		// Envia o Contato (preenchido) para o Banco de Dados
		ContatoDAO dao = new ContatoDAO();
		
		return dao.cadastrarContatoDAO(contato)
			? "Cadastro efetuado com sucesso!" : "Erro ao cadastrar o Contato"; // IF ternário
	}
	
	public ResultSet buscarContato(int id) throws SQLException {
		ContatoDAO dao = new ContatoDAO();
		return dao.buscarContatoDAO(id);
	}
}







