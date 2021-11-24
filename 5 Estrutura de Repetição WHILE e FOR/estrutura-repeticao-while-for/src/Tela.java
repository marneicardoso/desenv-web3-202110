import javax.swing.JOptionPane;

public class Tela {
    
    public String informarDados(String campo) {
        return JOptionPane.showInputDialog(campo);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public int confirmarFechar() {
        return JOptionPane.showConfirmDialog(
            null,                       // Componente parent (pai)
            "Tem certeza?",             // Mensagem
            "Encerrar Sistema",         // Título da janela
            JOptionPane.YES_NO_OPTION,  // Confirmação
            3                           // Ícone
            );
    }
}
