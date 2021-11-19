public class Calculadora {
    // Atributos (Global)
    private double valor1;
    private double valor2;
    private double resultado;

    // Cria os objetos das classes
    private Input input = new Input();
    private Tela tela = new Tela();

    // Métodos
    public void somarValores() {
        // Recebe os valores informados pelo usuário
        /*valor1 = input.informarValor("Informe o primeiro valor");
        valor2 = input.informarValor("Informe o segundo valor");*/
        receberValores();

        // Efetua o cálculo
        resultado = valor1 + valor2;

        // Mostra o resultado na tela
        tela.mostrarMensagem("Resultado da soma: " + resultado);
    }

    public void subtrairValores() {
        receberValores();
        resultado = valor1 - valor2;
        tela.mostrarMensagem("Resultado da subtração: " + resultado);
    }

    public void multiplicarValores() {
        receberValores();
        resultado = valor1 * valor2;
        tela.mostrarMensagem("Resultado da multiplicação: " + resultado);
    }

    public void dividirValores() {
        receberValores();
        resultado = valor1 / valor2;
        tela.mostrarMensagem("Resultado da divisão: " + resultado);
    }

    private void receberValores() {
        // Recebe os valores informados pelo usuário
        valor1 = input.informarValor("Informe o primeiro valor");
        valor2 = input.informarValor("Informe o segundo valor");
    }
}
