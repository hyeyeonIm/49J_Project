import java.awt.*;
import javax.swing.*;

abstract class tf_quiz extends JFrame{
    JPanel jPanel = new JPanel();
    JButton btn2 = new JButton("NEXT");

    JRadioButton trueButton = new JRadioButton("True");
    JRadioButton falseButton = new JRadioButton("False");

    Color color1 = new Color(198,218,214);
    Color color2 = new Color(109,146,155);

    public abstract void question();

    public tf_quiz(){
        setSize(500, 500); // size

        jPanel.setBackground(color1);
        btn2.setBackground(color2);

        trueButton.setBounds(120, 30, 120, 50);
        // trueButton.setMnemonic(KeyEvent.VK_B);
        trueButton.setActionCommand("True");
        trueButton.setSelected(true);

        falseButton.setBounds(250, 30, 80, 50);
        // falseButton.setMnemonic(KeyEvent.VK_B);
        falseButton.setActionCommand("False");
        falseButton.setSelected(true);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(trueButton);
        group.add(falseButton);

        setVisible(true);
    }
} 
