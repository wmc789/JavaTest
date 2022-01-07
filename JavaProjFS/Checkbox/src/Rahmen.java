import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Rahmen extends JFrame implements ActionListener{

    JButton button;
    JCheckBox checkBox;
    ImageIcon negIcon;
    ImageIcon posIcon;

    Rahmen(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //negIcon = new ImageIcon(getClass().getResource("redCM.png"));
        negIcon = new ImageIcon("redCM.png");
        posIcon = new ImageIcon("greenCM.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("Im a Robot? NO!");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(negIcon);
        checkBox.setSelectedIcon(posIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
}
