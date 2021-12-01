package model;

import view.Tela;

public class Agenda {

    public void iniciarAgenda() {
        // Cria um objeto da classe Tela
        Tela tela = new Tela();

        // Monta o Menu
        String menu = ":: Agenda de Contatos ::\n\n" +
            "1. Cadastrar\n" +
            "2. Buscar\n" +
            "3. Editar\n" +
            "4. Excluir\n\n";
        
        // Mantém o Menu ativo
        boolean isAtivo = true;

        // Loop principal do Sistema
        while (isAtivo) {
            String opcao = tela.informar(menu, "Informe uma opção do Menu", -1);

            switch (opcao) {
                case "1":
                    System.out.println("Cadastrar");
                    break;

                case "2":
                    System.out.println("Buscar");
                    break;

                case "3":
                    System.out.println("Editar");
                    break;

                case "4":
                    System.out.println("Excluir");
                    break;

                default:
                    int sair = tela.confirmar("Deseja sair?", "Encerrar", 3);

                    if (sair == 0) {
                        isAtivo = false;
                        tela.mostrar("Encerrando o sistema...", "Encerrando", 1);
                    }
            } // fecha switch
        } // fecha while
    } // fecha iniciarAgenda()
}
