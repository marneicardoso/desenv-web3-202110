import java.text.MessageFormat;
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

        //  a. Concatenação de String + Atributo 
        //System.out.println("O resultado é " + resultado);

        //  b. Concatenação de várias Strings e vários Atributos
        //System.out.println("O resultado da soma de " + valor1 + " + " + valor2 + " é " + resultado);

        //  c. Utilizando o método PRINTF (herdado da linguagem C)
        //System.out.printf("O resultado da soma de %f + %f é %f", valor1, valor2, resultado);
        // %d é usado para Inteiro, %f para Decimal, %s para String (texto)

        //  d. Interpolação de String e Atributos (para utilizar, importa java.text.MessageFormat)
        System.out.println(MessageFormat.format("Resultado da soma de {0} + {1} é {2}", valor1, valor2, resultado));

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