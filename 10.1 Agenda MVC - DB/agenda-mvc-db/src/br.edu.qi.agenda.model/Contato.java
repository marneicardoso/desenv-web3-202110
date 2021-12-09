package br.edu.qi.agenda.model;

public class Contato {
    // Atributos
    private int id;
    private String nome;
    private String email;
    private String senha;

    // Método Construtor
    public Contato(String _nome, String _email, String _senha) {
        this.nome = _nome;
        this.email = _email;
        this.senha = _senha;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
