import javax.swing.JOptionPane;

public class Tela {
    // Atributos

    // Métodos
    public void mostrarMensagem(String mensagem) {
        // Versão 1 - com System.out
        //System.out.println(mensagem);

        // Versão 2.1
        JOptionPane.showMessageDialog(null, mensagem);

        // Versão 2.2
        /*JOptionPane.showMessageDialog(
            null,               // Componente pai
            mensagem,           // Mensagem
            "Plain Message",    // Título da janela
            -1                  // Ícone
            );

        JOptionPane.showMessageDialog(
            null,               // Componente pai
            mensagem,           // Mensagem
            "Error Message",    // Título da janela
            0                   // Ícone
            );

        JOptionPane.showMessageDialog(
            null,                   // Componente pai
            mensagem,               // Mensagem
            "Information Message",  // Título da janela
            1                       // Ícone
            );

        JOptionPane.showMessageDialog(
            null,                   // Componente pai
            mensagem,               // Mensagem
            "Warning Message",      // Título da janela
            2                       // Ícone
            );

        JOptionPane.showMessageDialog(
            null,                   // Componente pai
            mensagem,               // Mensagem
            "Question Message",    // Título da janela
            3                       // Ícone
            );*/
    }
}
