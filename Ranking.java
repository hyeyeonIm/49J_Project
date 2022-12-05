
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
public class Ranking extends JFrame{
	private JFrame jf;
	private JTable jtable;
	private JScrollPane jsp;

    static String contents[][] = {
        // {"Jake", "AI", "Male", "8"},
        // {"Haley", "ME", "Female", "10"},
        // {"Minse", "CS", "Male", "6"},
        // {"mike", "test", "ai", "0"}
    };

        public Ranking() {
            // LOAD players from text file in Player Class with Linked List Data Structure
            // SORT player instances and extract TOP 3 players
            jf = new JFrame("RANKING");
            jf.setLocationRelativeTo(null);
            jf.setSize(500, 500);
            Color color1 = new Color(198,218,214);
            Color color2 = new Color(109,146,155);

            String header[] = {"name", "major", "gender", "score"};
            jtable = new JTable(contents, header);
		    jsp = new JScrollPane(jtable);

            JButton btn3 = new JButton("AGAIN");
            JButton btn4 = new JButton("END");
    
            jf.setBackground(color1);
            btn3.setBackground(color2);
            btn4.setBackground(color2);

            jf.add(jsp, BorderLayout.NORTH);
            jf.add(btn3, BorderLayout.WEST);
            jf.add(btn4, BorderLayout.EAST);
            jf.setVisible(true);

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
