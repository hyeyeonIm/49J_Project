import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


abstract class math_quiz extends JFrame{
    JPanel jPanel = new JPanel();
    JButton btn2 = new JButton("NEXT");
    JTextField answer = new JTextField() ; // answer
    
    Color color1 = new Color(198,218,214);
    Color color2 = new Color(109,146,155);

    public abstract void question();
    public abstract void answer();

    // for random generator
    public int num1;
    public int num2;

    public void random(){
        Random rand1 = new Random();
        Random rand2 = new Random();

        int upperbound1 = 5;
        int upperbound2 = 10;

        num1 = rand1.nextInt(upperbound1) + 1; // 1 ~ 5
        num2 = rand2.nextInt(upperbound2) + 7; // 7 ~ 15
    };

    // frame of math_quiz
    public math_quiz(){
        setSize(500, 500); // size
        jPanel.setLayout(new GridLayout(3, 4,0,50)) ;

        jPanel.setBackground(color1);
        btn2.setBackground(color2);

        setVisible(true);
    }
} 
