
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ranking extends JFrame{
	private JFrame jf;
	private JTable jtable;
	private JScrollPane jsp;
    // Make a String array to save the information of players
    static String contents[][] = new String[100][4];

        public Ranking() {
            // Make file reader to read file
            BufferedReader reader1;
            BufferedReader reader2;

            try {
                // Count number of lines(Players) in the file
                reader1 = new BufferedReader(new FileReader("player.txt"));
                int lines = 0; // variable which stores number of players
                // While there is no line to read
                while (reader1.readLine() != null) {
                    lines++;
                }
                reader1.close();
                
                // Create Instances using "lines"
                reader2 = new BufferedReader(new FileReader("player.txt"));
                // Make a LinkedList to store player objects
                LinkedList<Player> playerList = new LinkedList<Player>(); 
                String line2 = reader2.readLine(); // read first line
                // read and save new Player objects in playerList LinkedList
                for (int i = 0; i < lines; i ++) {
                    String[] Player_info = line2.split(", ");
                    playerList.add(new Player(Player_info[0], Player_info[1], Player_info[2], Integer.parseInt(Player_info[3])));
                    line2 = reader2.readLine(); // go to next line
                }

                reader2.close();

                // Sort players
                Collections.sort(playerList, Collections.reverseOrder());
                int cnt = 0;            // cnt increments while the reader reads lines,
                int topN = lines-1;     // until the last line
                
                // Iterates each player object
                for (Player p : playerList) {
                    contents[cnt][0] = p.name;                  // save object's name
                    contents[cnt][1] = p.major;                 // save object's major
                    contents[cnt][2] = p.gender;                // save object's gender
                    contents[cnt][3] = String.valueOf(p.score); // Parse the score variable to String.
                    
                    // If there is only one line,(= no need to sort object) break the loop
                    if (lines == 1)
                    {
                        break;
                    }
                    
                    // If the reader reaches at the last of the line, break it
                    if (cnt >= topN) {
                        break;
                    }
                    // Otherwise increment cnt
                    else{
                        cnt++;
                    }
                }
                System.out.println();


            // Handle exception (IOException)
            } catch (IOException e) {
                // Prints this throwable and its backtrace to the standard error stream.
                e.printStackTrace();
            }        

            // Make new JFrame
            jf = new JFrame("RANKING");
            jf.setLocationRelativeTo(null);
            jf.setSize(500, 500);
            Color color1 = new Color(198,218,214);
            Color color2 = new Color(109,146,155);

            // Set header
            String header[] = {"name", "major", "gender", "score"};
            jtable = new JTable(contents, header);
		    jsp = new JScrollPane(jtable); // scroll function 

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
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jf.setVisible(false); // invisible
                    jf.dispose();

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
