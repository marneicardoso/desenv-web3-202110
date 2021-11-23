public class Calculadora {
    // Atributos
    private Double valor1;
    private Double valor2;
    private Double resultado;

    // Métodos
    public void iniciarCalculadora() {

        // Objeto da classe Tela
        Tela tela = new Tela();

        // Cria o Menu de opções
        String menu = ":: Calculadora ::\n" +
            "\n1. Somar" +
            "\n2. Subtrair" +
            "\n3. Multiplicar" +
            "\n4. Dividir" +
            "\n0. Sair" +
            "\n\nInforme uma das operações";

        String operacao = tela.informarDados(menu);

        switch (operacao) {
            case "0":
                tela.mostrarMensagem("Encerrando...");
                break;

            case "1":
                tela.mostrarMensagem("Um");
                break;

            case "2":
                tela.mostrarMensagem("Dois");
                break;

            case "3":
                tela.mostrarMensagem("Três");
                break;

            case "4":
                tela.mostrarMensagem("Quatro");
                break;

            default:
                tela.mostrarMensagem("Opção inválida");
                break;
        }

        /*
        // if (operacao == "1") { // o mesmo que abaixo (formato incorreto)
        if (operacao.equals("1")) {
            tela.mostrarMensagem("Um");
        
        } else if (operacao.equals("2")) {
            tela.mostrarMensagem("Dois");
        
        } else if (operacao.equals("3")) {
            tela.mostrarMensagem("Três");
        
        } else if (operacao.equals("4")) {
            tela.mostrarMensagem("Quatro");
        
        } else if (operacao.equals("0")) {
            tela.mostrarMensagem("Sair");
        
        } else {
            tela.mostrarMensagem("Opção inválida");
        }*/
    }
}
