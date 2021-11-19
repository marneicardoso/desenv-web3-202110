import javax.swing.JOptionPane;

public class Input {
    // Atributos

    // Métodos
    public Double informarValor(String mensagem) {
        String valor = JOptionPane.showInputDialog(mensagem);
        double valorConvertido = Double.parseDouble(valor);
        return valorConvertido;

        // Forma encurtada
        //return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
    }
}
