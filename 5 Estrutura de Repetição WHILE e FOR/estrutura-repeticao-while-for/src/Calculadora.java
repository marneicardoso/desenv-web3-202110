public class Calculadora {
    // Atributos
    private Double valor1;
    private Double valor2;
    // private Double resultado;

    // Objeto da classe Tela
    Tela tela = new Tela();

    // Métodos
    public void iniciarCalculadora() {

        // Cria o Menu de opções
        String menu = ":: Calculadora ::\n" +
            "\n1. Somar" +
            "\n2. Subtrair" +
            "\n3. Multiplicar" +
            "\n4. Dividir" +
            "\n0. Sair" +
            "\n\nInforme uma das operações";
        
        // Controla o loop principal
        boolean isAtivo = true;

        // while (isAtivo == true) { // forma correta abaixo
        while (isAtivo) {
            String operacao = tela.informarDados(menu);

            switch (operacao) {
                case "0":
                    int sair = tela.confirmarFechar();

                    // 0 == Sim
                    // 1 == Não
                    if (sair == 0) {
                        tela.mostrarMensagem("Encerrando o sistema...");
                        isAtivo = false;
                    }
                    // System.out.println("Sair: " + sair);

                    /*tela.mostrarMensagem("Encerrando...");
                    isAtivo = false;*/
                    break;
    
                case "1":
                    tela.mostrarMensagem("Resultado: " + somar());

                    // resultado = somar();
                    // tela.mostrarMensagem("Resultado: " + resultado);
                    // tela.mostrarMensagem(resultado.toString());
                    // tela.mostrarMensagem(""+resultado); // Gambiarra
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

        // Exemplos básicos de WHILE e FOR
        /*int contador = 1;

        while (contador <= 10) {
            // Mostra o valor do contador
            System.out.println(contador);
            
            // Incrementa o contador
            contador++;
            // contador = contador + 1;
            // contador += 1;
        }*/

        /*for (int contador = 1; contador <= 10; contador++) {
            System.out.println(contador);
        }*/
    } // fecha o método iniciarCalculadora

    private void exemploIfTernario() {
        int a = 2;

        boolean b = true ? (a > 3) : false;

        if (a > 3) {
            b = true;
        } else {
            b = false;
        }

        System.out.println(b);
    }

    private Double somar() {

        try {
            valor1 = Double.parseDouble(tela.informarDados("Informe o primeiro valor"));
            valor2 = Double.parseDouble(tela.informarDados("Informe o segundo valor"));
            return valor1 + valor2;
        
        } catch (Exception e) {
            tela.mostrarMensagem("Informe apenas números");
            return null;
        }

        // valor1 = Double.parseDouble(tela.informarDados("Informe o primeiro valor"));
        // valor2 = Double.parseDouble(tela.informarDados("Informe o segundo valor"));

        // return valor1 + valor2;

        /*
        resultado = valor1 + valor2;

        return resultado;*/
    }
}
