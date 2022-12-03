import java.awt.*;
import javax.swing.*;

abstract class quizframe2 extends JFrame{
    JPanel jPanel = new JPanel();
    JButton btn2 = new JButton("NEXT");

    Color color1 = new Color(198,218,214);
    Color color2 = new Color(109,146,155);

    public abstract void question();

    public quizframe2(){
        setSize(500, 500); // size

        jPanel.setBackground(color1);
        btn2.setBackground(color2);

        JRadioButton trueButton = new JRadioButton("True");
        trueButton.setBounds(120, 30, 120, 50);
        // trueButton.setMnemonic(KeyEvent.VK_B);
        trueButton.setActionCommand("True");
        trueButton.setSelected(true);

        JRadioButton falseButton = new JRadioButton("False");
        falseButton.setBounds(250, 30, 80, 50);
        // falseButton.setMnemonic(KeyEvent.VK_B);
        falseButton.setActionCommand("False");
        falseButton.setSelected(true);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(trueButton);
        group.add(falseButton);

        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);

        setVisible(true);
    }
} 
