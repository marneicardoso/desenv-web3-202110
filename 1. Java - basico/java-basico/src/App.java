public class App {
    public static void main(String[] args) throws Exception {
        
        // === Variáveis e Tipos === //

        // O que é variável?
        // R: Espaço reservado na memória (RAM) do computador
        //    para armazenar valores temporários.

        // Tipos
        // inteiro == int       1   5   43
        // decimal == double    1.23    0.75
        // texto   == String    "Marnei"    "23"
        // boleano == boolean   true    false

        // Para criar/declarar uma variável
        // TIPO     NOME    VALOR
        int valor1 = 5;
        int num2 = 3;
        double preco = 17.5;
        String nome = "Marnei";
        boolean ligado = true;

        // 7. Nomenclatura de variáveis

        // === Nomes aceitos para variáveis:
        // deve iniciar com letra minúscula
        // nomeDaVariavel
        // camelCase
        // nome_variavel
        // _nome
        
        // === Não aceitos:
        // 23variavel
        // acentos
        // cedilha
        // nome-variavel (aceita em CSS)
        // não pode ter caracteres especiais como @ # / ? :

        // Sintaxe == forma de escrever

        // Semântica == o significado de uma instrução

        // Java é uma linguagem de tipagem forte, ou seja,
        // é necessário informar o tipo da variável (pote)

        // Exemplo de declaração de variável:
        int numero1 = 5;
        // Leia: a variável numero1, do tipo inteiro recebe o valor 5

        int numero2 = 4;

        int soma = numero1 + numero2;

        //System.out.println(soma);

        /* TIPOS PRIMITIVOS
            int     == inteiro (5, 3, 45)
            double  == decimal (0.75, 1.23)
            char    == caracter ('a', 'A', 'M', '9')
            boolean == booleano (true, false)
        */

        /* TIPOS WRAPPER (envelope)
            Integer == inteiro (5, 3, 45)
            Double  == decimal (0.75, 1.23)
            String  == caracter ("Marnei", "A", "Um texto completo", "9")
            Boolean == booleano (true, false)
        */

        // Converter uma String (texto) em valor numérico
        String numeroEmTexto = "23";
        int numInteiro1 = Integer.parseInt(numeroEmTexto);
        int numInteiro2 = 2;
        int somaInteiro = numInteiro1 + numInteiro2;

        // syso == Atalho para System.out.println()
        System.out.println("O resultado da soma é: " + somaInteiro);
        
        // Concatenar significa ??
        // R: Juntar duas Strings ou uma String e um valor numérico

        // :: Programação Estruturada (Procedural) ::

        // 1. Declaração das variáveis
        // 2. Atribuição de valores (ENTRADA)
        // 3. Cálculos e validações (PROCESSAMENTO
        // 4. Mostra o resultado na tela (SAÍDA)

        // Enunciado:
        // Escreva um algoritmo que receba dois valores, some e mostre o resultado.

        // 1. Declaração das variáveis
        int primeiroValor;
        int segundoValor;
        int somaValores;

        // 2. Atribuição de valores (ENTRADA)
        primeiroValor = 45;
        segundoValor = 5;

        // 3. Cálculos e validações (PROCESSAMENTO)
        somaValores = primeiroValor + segundoValor;

        // 4. Mostra o resultado na tela (SAÍDA)
        System.out.println("Resultado: " + somaValores);
    }
}

// Comentário de linha

/* Comentário
    de Bloco
*/