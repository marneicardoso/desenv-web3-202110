package model;
import java.util.ArrayList;
import java.util.List;

// Design Pattern Singleton
// Padrão de Projetos Singleton
public class Lista {
    // Atributos
    private static List<Contato> lista;

    // Cria uma INSTÂNCIA ÚNICA da Lista
    public static List<Contato> getInstance() {
        // Se ainda NÃO existir a instância (objeto), cria uma
        if (lista == null) {
            lista = new ArrayList();
        }

        return lista;
    }
}
