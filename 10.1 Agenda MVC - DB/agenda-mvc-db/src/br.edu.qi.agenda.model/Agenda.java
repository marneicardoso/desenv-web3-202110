package br.edu.qi.agenda.model;
import br.edu.qi.agenda.view.Tela;

public class Agenda {
    // Cria um objeto da classe Tela (GLOBAL)
    Tela tela = new Tela();

    public void iniciarAgenda() {
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
                    //cadastrarContato();
                    break;

                case "2":
                    //buscarContato();
                    break;

                case "3":
                    //editarContato();
                    break;

                case "4":
                    //excluirContato();
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

    private void cadastrarContato() {
        // Usuário informa os dados
        String nome = tela.informar("Informe o nome", "Nome", 1);
        String email = tela.informar("Informe o e-mail", "E-mail", 1);
        String senha = tela.informar("Informe a senha", "Senha", 1);

        // Cria o objeto da classe Contato
        Contato contato = new Contato(nome, email, senha);

        // Envia o contato (preenchido) para o DB
        ContatoDAO dao = new ContatoDAO();
        boolean isCadastro = dao.cadastrarContatoDAO(contato);

        if (isCadastro) {
            tela.mostrar("Cadastro efetuado com sucesso!", "Cadastro", 1);
        
        } else {
            tela.mostrar("Erro ao Cadastrar o contato", "Cadastro", 1);
        }
    }
}
