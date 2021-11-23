public class Main {

    public static void main(String[] args) {
        // Cria o objeto da classe Tela
        Tela tela = new Tela();

        // Cria o(s) objeto(s) da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Maria");
        Pessoa pessoa3 = new Pessoa(3, "Ana", "99887766", 33, 65.232);

        // Atribui um nome
        pessoa1.setNome("Calebe");
        pessoa2.setNome("Marli");
        pessoa3.setIdade(32);

        // Mostra os dados da pessoa
        /*
         * tela.mostrarDados(pessoa1.getNome()); tela.mostrarDados(pessoa2.getNome());
         * tela.mostrarDados( "ID: " + pessoa3.getId() + "\nNome: " + pessoa3.getNome()
         * + "\nFone: " + pessoa3.getFone() + "\nIdade: " + pessoa3.getIdade() +
         * "\nPeso: " + pessoa3.getPeso() );
         */

        pessoa1.setIdade(15);

        // boolean dirigir = pessoa1.podeDirigir();
        // tela.mostrarDados("Dirigir? " + dirigir);

        tela.mostrarDados(pessoa3.votar());
    }
}

// Alt + Shift + F (formatar o código)