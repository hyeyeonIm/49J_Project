import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class input extends JFrame {
        JPanel jPanel = new JPanel();
        
        private JLabel name ;
        private JLabel major ;
        private JLabel gender ;
    
        private JTextField name_text ;
        private JTextField major_text ;
        private JTextField gender_text ;
        
        static String name_info;
        static String major_info;
        static String gender_info;
    
        private JButton btn1;

        public input() {
    
            super("Enter your info!");
    
            name = new JLabel("Name") ;
            major = new JLabel("Major") ;
            gender = new JLabel("Gender");
    
            name_text = new JTextField() ;
            major_text = new JTextField() ;
            gender_text = new JTextField();
    
            btn1 = new JButton("Start!");
    
            setSize(500, 500); // size
            Color color1 = new Color(198,218,214);
            Color color2 = new Color(109,146,155);
    
            jPanel.setBackground(color1);
            btn1.setBackground(color2);
    
            // vertical gap : 50
            jPanel.setLayout(new GridLayout(3, 4,0,50)) ;
    
            jPanel.add(name, BorderLayout.EAST) ;
            jPanel.add(name_text, BorderLayout.WEST) ;
            jPanel.add(major, BorderLayout.EAST) ;
            jPanel.add(major_text, BorderLayout.WEST) ; 
            jPanel.add(gender, BorderLayout.EAST) ;
            jPanel.add(gender_text, BorderLayout.WEST) ; 
        
            this.add(jPanel, BorderLayout.CENTER) ; 
            this.add(btn1, BorderLayout.SOUTH) ;
    
            setVisible(true);
    
            // button
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Save info
                    name_info = name_text.getText();
                    major_info = major_text.getText();
                    gender_info = gender_text.getText();

                    // Change Frame
                    // Call Quiz1 and Quiz1 extends quizframe1. So, we have to create object
                    Quiz q1 = new Quiz();
                    q1.question();
                    q1.answer();
                    setVisible(false); // invisible
                }
            });
        }
        public static void main(String[] args) {
            new input();
        }
}