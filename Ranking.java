import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Ranking extends JFrame{
        public Ranking() {
            super("RANKING");
            // LOAD players from text file in Player Class with Linked List Data Structure

            // SORT player instances and extract TOP 3 players

                // Save top 3 players' name, major, gender, SCORE in local variables

            JPanel jPanel = new JPanel();
            JButton btn3 = new JButton("AGAIN");
            JButton btn4 = new JButton("END");
    
            setSize(500, 500); // size
            Color color1 = new Color(198,218,214);
            Color color2 = new Color(109,146,155);
    
            jPanel.setBackground(color1);
    
            jPanel.add(btn3);
            jPanel.add(btn4);
            jPanel.add(btn3, BorderLayout.WEST) ;
            jPanel.add(btn3, BorderLayout.EAST) ;
    
            btn3.setBackground(color2);
            btn4.setBackground(color2);
            add(jPanel);
    
            // MAKE LABELS to show top 3 players



            setVisible(true);
            
            btn3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new input(); // Go MainFrame
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

    public static void main(String[] args) {
        new Ranking();
    }
}
