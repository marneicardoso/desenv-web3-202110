import java.util.Random;

public class Matriz {
    // Array (Vetores e Matrizes) em Java

    // Declara o Array e determina a quantidade de posições da variável
    int[] valor1 = new int[5];
    int valor2[] = new int[5]; // Forma mais comum
    int valor3[] = { 5, 3 };

    public void adicionarValor() {
        // Preenche o Array
        valor1[0] = 8;
        valor1[3] = 9;
        valor1[1] = 5;

        // System.out.println("Valor1[]: " + valor1[3]);
        //System.out.println("Valor1[]: " + valor1[5]); // Fora do limite (Index 5 out of bounds)

        /*System.out.println(
            "Array valor1: " +
            valor1[0] + ", " +
            valor1[1] + ", " +
            valor1[2] + ", " +
            valor1[3] + ", " +
            valor1[4]
        );

        System.out.println("Tamanho do Array 1: " + valor1.length);*/

        int valor4[] = new int[100];
        int i = 0; // contador (iterator)

        // while (i < 100) {
        while (i < valor4.length) {
            valor4[i] = i +1;
            System.out.println(valor4[i]);
            i++;
        }

        // Length é o tamanho

        /*for (int n: valor4) {
            System.out.println(n);
        }*/
    }

    public void matrizMultidimensional() {
        int matriz[][] = new int[3][3];

        // Linha 1
        matriz[0][0] = 5;
        matriz[0][1] = 7;
        matriz[0][2] = 4;

        // Linha 2
        matriz[1][0] = 6;
        matriz[1][1] = 8;
        matriz[1][2] = 3;

        // Linha 3
        matriz[2][0] = 1;
        matriz[2][1] = 2;
        matriz[2][2] = 9;

        // System.out.println(matriz[2][1]);

        // Percorre toda a matriz
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println("");
        }
    }

    public void batalhaNaval() {
        // Cria a matriz (tabuleiro)
        int matriz[][] = new int[10][10];

        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            // Linha
            System.out.print("");

            for (int j = 0; j < 10; j++) {
                // Colunas
                matriz[i][j] = gerador.nextInt(100) +1;

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println("");
        }
    }
}
