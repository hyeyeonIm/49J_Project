
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

    static String contents[][] = new String[3][4];

        public Ranking() {
            //test
            BufferedReader reader1;
            BufferedReader reader2;

            try {
                // Count number of lines(Players) in the file
                reader1 = new BufferedReader(new FileReader("player.txt"));
                int lines = 0; // variable which stores number of players

                while (reader1.readLine() != null) {
                    lines++;
                }
                reader1.close();

                
                // Create Instances using "lines"
                reader2 = new BufferedReader(new FileReader("player.txt"));
                // Player [] players = new Player [lines]; 
                

                LinkedList<Player> playerList = new LinkedList<Player>(); // Make a linkedlist to save player instances
                String line2 = reader2.readLine(); // read first line
                for (int i = 0; i < lines; i ++) {
                    // System.out.println(line2);
                    String[] Player_info = line2.split(", ");
                    playerList.add(new Player(Player_info[0], Player_info[1], Player_info[2], Integer.parseInt(Player_info[3])));
                    line2 = reader2.readLine(); // go to next line
                    // Player player = new Player(Player_info[0], Player_info[1], Player_info[2], Integer.parseInt(Player_info[3]));
                    // player.setPlayer();
                    // player.setScore();
                    // players[i] = player;
                }

                reader2.close();

                // Sort and Print player
                Collections.sort(playerList, Collections.reverseOrder());
                int cnt = 0;
                int topN = 2;
                for (Player p : playerList) {
                    // System.out.println(p.name + " " + p.major + " " + p.gender + " " + p.score);
                    contents[cnt][0] = p.name;
                    contents[cnt][1] = p.major;
                    contents[cnt][2] = p.gender;
                    contents[cnt][3] = String.valueOf(p.score);
            
                    if (cnt >= topN) {
                        break;
                    }
                    else{
                        cnt++;
                    }
                }
                System.out.println();

                // pass to FRAME
                // Player [] topThreePlayers = new Player [3];

            } catch (IOException e) {
                e.printStackTrace();
            }        

            // end test
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
