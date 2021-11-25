import javax.swing.JOptionPane;

public class Galinha extends Animal {
    @Override
    public void falar() {
        JOptionPane.showMessageDialog(null, "Cocoricó");
    }
}
