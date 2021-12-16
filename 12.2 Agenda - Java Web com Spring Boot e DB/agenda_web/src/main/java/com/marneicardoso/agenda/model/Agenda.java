package com.marneicardoso.agenda.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Contato> buscarContato(int id) throws SQLException {
		ContatoDAO dao = new ContatoDAO();
		ResultSet resultado = dao.buscarContatoDAO(id);

		List<Contato> listaDeContatos = new ArrayList<>();

		while (resultado.next()) {
			// Preenche o objeto COntato com os dados vindos do DB 
			Contato objetoContato = new Contato();
			objetoContato.setId(resultado.getInt("id"));
			objetoContato.setNome(resultado.getString("nome"));
			objetoContato.setEmail(resultado.getString("email"));
			objetoContato.setFone(resultado.getString("fone"));
			
			// Adiciona o Contato preenchido na lista
			listaDeContatos.add(objetoContato);
		}

		return listaDeContatos;
	}
}







