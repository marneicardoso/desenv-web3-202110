package br.edu.qi.agenda.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {
    
    // Abre a conexão com o DB
    public Connection abrirConexao() {
        // Atributos da conexão
        String servidor = "localhost";
        String porta = ":3306";
        String nomeBanco = "/agenda";
        String usuario = "root";
        String senha = "";

        // Monta a URL de conexão
        String url = "jdbc:mysql://" + servidor + porta + nomeBanco;
                   // jdbc:mysql://localhost:3306/agenda

        // Interface de conexão com o DB
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }

    public void fecharConexao(Connection conexaoAberta) {
        conexaoAberta.close();
    }
}
