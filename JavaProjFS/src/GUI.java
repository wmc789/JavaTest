import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Name eingeben !");
        JOptionPane.showMessageDialog(null, "Hallo "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben !"));
        JOptionPane.showMessageDialog(null, "du bist also schon "+age+" Jahre alt, wow!");
    }
}

