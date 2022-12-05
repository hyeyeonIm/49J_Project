import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Player implements Comparable<Player> {
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


    // private String[] info={"","",""};
    // private int score=0;

    // // Other classes can get info and score
    // public String[] getPlayer(){
    //     return this.info;
    // }
    // public int getScore(){
    //     return score;
    // }

    // // Other class can change in info and score
    // public void setPlayer(String name_info, String major_info, String gender_info){
    //     info[0]=name_info;
    //     info[1]=major_info;
    //     info[2]=gender_info;
    // }
    // public void setScore(int score){
    //     this.score=score;
    // }

    

}