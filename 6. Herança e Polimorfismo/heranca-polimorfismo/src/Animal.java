import javax.swing.JOptionPane;

public class Animal {
    // Atributos da classe Super (mãe)
    private String nome;
    private int idade;
    private double peso;
    private double valor;

    // Métodos da classe Super (mãe)
    public void comer() {
        JOptionPane.showMessageDialog(null, "Animal: comer()");
    }

    public void falar() {
        JOptionPane.showMessageDialog(null, "Som do animal");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
