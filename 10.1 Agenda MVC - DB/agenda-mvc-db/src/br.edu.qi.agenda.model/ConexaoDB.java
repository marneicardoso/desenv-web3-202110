package br.edu.qi.agenda.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    // Abre a conexão com o DB
    public Connection abrirConexao() throws SQLException {
        // Atributos da conexão
        String servidor = "localhost";
        //String porta = ":3306";
        String porta = "";
        String nomeBanco = "/agenda";
        String usuario = "root";
        String senha = "";

        // Monta a URL de conexão
        String url = "jdbc:mysql://" + servidor + porta + nomeBanco;
                   // jdbc:mysql://localhost/agenda

        // Interface de conexão com o DB
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }

    public void fecharConexao(Connection conexaoAberta) throws SQLException {
        conexaoAberta.close();
    }
}
