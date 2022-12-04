public class Player {
    private String[] info={"","",""};
    private int score=0;

    // Other classes can get info and score
    public String[] getPlayer(){
        return this.info;
    }
    public int getScore(){
        return score;
    }

    // Other class can change in info and score
    public void setPlayer(String name_info, String major_info, String gender_info){
        info[0]=name_info;
        info[1]=major_info;
        info[2]=gender_info;
    }
    public void setScore(int score){
        this.score=score;
    }

                        // Store in Player class
                        // player1.setPlayer(name_info,major_info,gender_info);
                        // player1.setScore(1);
        
                        // System.out.println(player1.getPlayer()[0]);
                        // System.out.println(player1.getPlayer()[1]);
                        // System.out.println(player1.getPlayer()[2]);
                        // System.out.println(player1.getScore());
}