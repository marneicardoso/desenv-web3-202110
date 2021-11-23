import javax.swing.JOptionPane;

public class Tela {
    
    public String informarDados(String campo) {
        return JOptionPane.showInputDialog(campo);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
