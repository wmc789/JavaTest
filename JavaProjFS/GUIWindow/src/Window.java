import javax.swing.*;
import java.awt.*;

public class Window {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hallo ich bin das neue Fenster!");

    Window(){
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.PLAIN,25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}