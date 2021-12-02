package model;
import view.Tela;

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
                    cadastrarContato();
                    break;

                case "2":
                    buscarContato();
                    break;

                case "3":
                    editarContato();
                    break;

                case "4":
                    excluirContato();
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
        String nome = tela.informar("Informe o Nome", "Nome", 1);
        String email = tela.informar("Informe o E-mail", "E-mail", 1);
        String fone = tela.informar("Informe o Telefone", "Fone", 1);

        // Cria o objeto da classe Contato
        Contato contato = new Contato(nome, email, fone);

        // Adiciona na lista de contatos
        Lista.getInstance().add(contato);

        tela.mostrar("Contato cadastrado com sucesso!", "Cadastro", 1);
        
    } // fecha cadastrarContato()

    private void buscarContato() {
        // Guarda o número de registros na lista de contatos
        int numeroRegistros = Lista.getInstance().size();

        if (numeroRegistros > 0) {
            String contatos = "";

            for (int i = 0; i < numeroRegistros; i++) {
                contatos +=
                    "ID: " + (i +1) +
                    "\nNome: " + Lista.getInstance().get(i).getNome() +
                    "\nE-mail: " + Lista.getInstance().get(i).getEmail() +
                    "\nFone: " + Lista.getInstance().get(i).getFone() +
                    "\n\n";
            }

            // Mostra o resultado da busca
            tela.mostrar(contatos, "Contatos", 1);
        
        } else {
            tela.mostrar("Nenhum contato registrado", "Contatos", 1);
        }
    } // fecha buscarContato()

    private void editarContato() {
        // Mostra os registros de contato
        buscarContato();

        // Verifica se há algum registro de contato
        if (Lista.getInstance().size() < 1) {
            return; // Early return (retorno precoce)
        }

        // Usuário informa o ID para editar
        int id;

        try {
            id = Integer.parseInt(tela.informar("Informe um ID para editar", "Editar", 1));

        } catch (Exception e) {
            tela.mostrar("Informe um ID numérico", "Editar", 2);
            return; // Early return (retorno precoce)
        }

        // Verifica se o ID informado é maior que os registros
        if (id > Lista.getInstance().size()) {
            tela.mostrar("ID informado é inválido", "Editar", 2);
            return; // Early return (retorno precoce)
        }

        // Usuário informa os novos dados do contato
        String novoNome = tela.informar("Informe o novo Nome", "Nome", 1);
        String novoEmail = tela.informar("Informe o novo E-mail", "E-mail", 1);
        String novoFone = tela.informar("Informe o novo Telefone", "Fone", 1);

        // Verifica se os campos foram preenchidos
        if (!novoNome.equals("")) { // Se NÃO for em branco
            Lista.getInstance().get(id -1).setNome(novoNome);
        }

        if (!novoEmail.equals("")) { // Se NÃO for em branco
            Lista.getInstance().get(id -1).setEmail(novoEmail);
        }

        if (!novoFone.equals("")) { // Se NÃO for em branco
            Lista.getInstance().get(id -1).setFone(novoFone);
        }

        tela.mostrar("Contato editado com sucesso", "Editar", 1);
    }

    private void excluirContato() {
        // Mostra os registros de contato
        buscarContato();

        // Verifica se há algum registro de contato
        if (Lista.getInstance().size() < 1) {
            return; // Early return (retorno precoce)
        }

        // Usuário informa o ID para editar
        int id;

        try {
            id = Integer.parseInt(tela.informar("Informe um ID para editar", "Excluir", 1));

        } catch (Exception e) {
            tela.mostrar("Informe um ID numérico", "Excluir", 2);
            return; // Early return (retorno precoce)
        }

        // Verifica se o ID informado é maior que os registros
        if (id > Lista.getInstance().size()) {
            tela.mostrar("ID informado é inválido", "Excluir", 2);
            return; // Early return (retorno precoce)
        }

        // Remove o contato da lista
        Lista.getInstance().remove(id -1);

        tela.mostrar("Contato excluído com sucesso", "Excluir", 1);
    }
}
