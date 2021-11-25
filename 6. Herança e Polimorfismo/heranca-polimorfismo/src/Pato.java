import javax.swing.JOptionPane;

public class Pato extends Animal {
    @Override
    public void falar() {
        JOptionPane.showMessageDialog(null, "Qualé, qualé");
    }
}
