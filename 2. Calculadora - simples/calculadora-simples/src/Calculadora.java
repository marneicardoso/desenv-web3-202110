import java.util.Scanner;

public class Calculadora {
    // 1. Declaração dos Atributos (variáveis)
    double valor1;
    double valor2;
    double resultado;
    // Cria um objeto da classe Scanner
    Scanner input = new Scanner(System.in);

    public void somarValores() {
        // 2. Atribuição de valores (ENTRADA)
        System.out.println("Informe o primeiro valor");
        valor1 = input.nextDouble();

        System.out.println("Informe o segundo valor");
        valor2 = input.nextDouble();

        // 3. Cálculos e validações (PROCESSAMENTO)
        resultado = valor1 + valor2;

        // 4. Mostra o resultado na tela (SAÍDA)
        System.out.println("A soma é: " + resultado);
    }

    // #DESAFIO: Criar as outras operações (subtrair, dividir, multiplicar)
}

// Padrão de declaração de Métodos
// inicia com letra minúscula
// utiliza camelCase
// Nomenclatura:
// verbo no infinitivo (fazer, ler, mostrar)
// seguido de um substantivo (ou adjetivo)
// Exemplo:
// somarValores()