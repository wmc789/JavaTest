import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon icon = new ImageIcon("point.png");
        ImageIcon icon2 = new ImageIcon("face.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(350, 250, 650, 250);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 550, 100);
        button.addActionListener(this);
        button.setText("Drück aufs Knöpfchen, Max!");

        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.black);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700,450);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    int clickCounter = 0;

    @Override
    public void actionPerformed(ActionEvent e) {  //eig soll nach jedem Klick ein neuer String ausgegeben werden !!



        //System.out.println(clickCounter);

        if (e.getSource() == button && clickCounter == 0) {

            System.out.println("\n");
            System.out.println("Wir sind auf 150 !\n");
            clickCounter++;
        }
        else if (e.getSource() == button && clickCounter == 1) {
            System.out.println("200 !\n");
            clickCounter++;
        }
        else if (e.getSource() == button && clickCounter == 2){
            System.out.println("PROFESSOR 300 !!!!\n");
            clickCounter++;
        }
        else if (e.getSource() == button && clickCounter == 3){
            System.out.println("HAAA HAAAA HAAAA\n");
            clickCounter++;
        }


        button.setEnabled(true);
        label.setVisible(true);
        ///clickCounter++;

    }

}


