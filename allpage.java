import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;


//First Frame
class MainFrame extends JFrame{ 
    JPanel jPanel = new JPanel();
    
    private JLabel name ;
    private JLabel major ;
    private JLabel gender ;

    private JTextField name_text ;
    private JTextField major_text ;
    private JTextField gender_text ;
    
    // Player
    public String name_info;
    public String major_info;
    public String gender_info;

    private JButton btn1;

    MainFrame() {

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
                new Quiz1();
                setVisible(false); // invisible
            }
        });
    }
}// Finish inputpage

// Quiz Frame
class Quiz1 extends JFrame{
    Quiz1() {
        super("Quiz1");
        JPanel jPanel = new JPanel();
        JButton btn2 = new JButton("NEXT");
        setSize(500, 500); // size
        Color color1 = new Color(198,218,214);
        Color color2 = new Color(109,146,155);

        jPanel.setBackground(color1);
        btn2.setBackground(color2);
        jPanel.add(btn2);
        add(jPanel);

        setVisible(true);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ranking_System();
                setVisible(false); // invisible
            }
        });
    }
}


// Ranking System
class Ranking_System extends JFrame{
    Ranking_System() {
        super("RANKING");

        JPanel jPanel = new JPanel();
        JButton btn3 = new JButton("AGAIN");
        JButton btn4 = new JButton("END");

        setSize(500, 500); // size
        Color color1 = new Color(198,218,214);
        Color color2 = new Color(109,146,155);

        jPanel.setBackground(color1);
        jPanel.add(btn3);
        jPanel.add(btn4);
        btn3.setBackground(color2);
        btn4.setBackground(color2);
        add(jPanel);

        setVisible(true);
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame(); // Go MainFrame
                setVisible(false); // invisible
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // exit
            }
        });
}

}
    
//Main
public class allpage {
    public static void main(String[] args) {
        new MainFrame();
    }
} 