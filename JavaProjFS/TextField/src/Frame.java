import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{

    JButton button;
    JTextField textField;

    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("submit");

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));

        this.add(textField);
        this.pack();
        this.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JTextField.getText();
        }
    }

}
