package br.edu.qi.agenda.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContatoDAO {
    
    public Boolean cadastrarContatoDAO(Contato contato) {
        // instrução SQL para adicionar um registro no DB
        String sql =
            "INSERT INTO contato (nome, email, senha)" + 
            "VALUES" +
            "(?, ?, ?)";
            //"('" + contato.getNome() + "')" // Não usar este formato
            //"('Marnei', 'prof.marneicardoso@gmail.com', '12345')"
        
        ConexaoDB objConexao = new ConexaoDB();
        Connection conexaoAberta = objConexao.abrirConexao();
        PreparedStatement statement = conexaoAberta.prepareStatement(sql);

        // Adiciona os valores informados pelo usuário, em cada posição (interrogação)
        statement.setString(1, contato.getNome());
        statement.setString(2, contato.getEmail());
        statement.setString(3, contato.getSenha());

        // Executa a instrução (comando SQL) no DB
        boolean isCadastro = statement.execute();

        // Fecha o Statement e a conexão com o DB
        statement.close();
        objConexao.fecharConexao(conexaoAberta);

        return isCadastro;
    }
}
