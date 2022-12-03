import java.awt.Color;

import javax.swing.*;

abstract class quizframe2 extends JFrame{
    JPanel jPanel = new JPanel();
    JButton btn2 = new JButton("NEXT");

    Color color1 = new Color(198,218,214);
    Color color2 = new Color(109,146,155);

    public abstract void question();
    public abstract void choice();

    public quizframe2(){
        setSize(500, 500); // size

        jPanel.setBackground(color1);
        btn2.setBackground(color2);

        setVisible(true);
    }
} 
