import java.util.ArrayList;
import java.util.List;
// import java.util.Random;

public class Sistema {
    
    public void iniciarSistema() {
        
        // Array
        /*int num[] = new int[5];
        System.out.println(num.length);*/

        // Declaração de ArrayList
        List<Integer> lista = new ArrayList();

        // Atribuir valores à lista
        lista.add(23);
        lista.add(5);

        // Mostra o tamanho da lista (quantidade de itens)
        // System.out.println(lista.size());
        System.out.println("Tamanho: " + lista.size());

        // Mostra o conteúdo da lista
        System.out.println(lista);

        /*Random random = new Random();

        while (lista.size() < 25) {
            lista.add(random.nextInt(100) +1);
        }

        System.out.println("Novo tamanho: " + lista.size());
        System.out.println(lista);*/

        // lista[1] = 3; // Funciona com Array
        lista.set(1, 3);
        System.out.println(lista);

        lista.add(9);
        System.out.println(lista.size());
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista.size());
        System.out.println(lista);

        System.out.println(lista.get(1));
    }
}
