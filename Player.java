import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Player implements Comparable<Player> {
    // implements Comparable to sort by score
    // Get name, major, gender as String
    // Get score as int
    String name;
    String major;
    String gender;
    int score;

    Player (String name, String major, String gender, int score){
        this.name = name;
        this.major = major;
        this.gender = gender;
        this.score = score;
    }

    // Override the compareTo() method
    @Override public int compareTo(Player p)
    {
        if (score > p.score) {
            return 1;
        }
        else if (score == p.score) {
            return 0;
        }
        else {
            return -1;
        }
    }
}