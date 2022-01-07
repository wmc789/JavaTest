import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Frame(){

        //Jthis this = new Jthis();  //erstellt this
        this.setTitle("Titel steht hier"); //Titel des thiss
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //schließt das Programm wenn this geschlossen
        this.setSize(420,420); // Dimension des thiss
        this.setResizable(true); //selbsterklärend
        this.setVisible(true); //macht this sichtbar

        ImageIcon image = new ImageIcon("5bba07af-6379-4a76-9d5e-e07971ac5daf.png");
        this.setIconImage(image.getImage());
        //this.getContentPane().setBackground(Color.BLUE); //änder Farbe des Hintergrunds
        this.getContentPane().setBackground(new Color(12,120,188)); //Farbe selber erstellen
    }
}
