import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) {
        // Cria o objeto da classe Animal
        Animal animal01 = new Animal();
        // animal01.comer();
        // animal01.falar();
        /*animal01.setNome("Totó");
        animal01.setIdade(2);
        animal01.setPeso(10.5);
        animal01.setValor(149.9);*/
        Animal galinha = new Galinha();
        /*galinha.setNome("Giselda");
        galinha.setIdade(5);
        galinha.setPeso(1.8);
        galinha.setValor(35);

        JOptionPane.showMessageDialog(null,
            "Nome: " + galinha.getNome() +
            "\nIdade: " + galinha.getIdade() + " meses" +
            "\nPeso: " + galinha.getPeso() + "Kg" +
            "\nPreço: R$ " + galinha.getValor()
        );

        galinha.falar();*/

        Animal pato = new Pato();
        // Pato pato = new Pato();
        // Pato pato = new Animal(); // Não pode herdar de sua classe filha
        pato.falar();
    }
}
