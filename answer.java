public class answer {
    private String input="";
    private int answer=0;

    // Other classes can get info and score
    public String getInput(){
        return input;
    }
    public int getAnswer(){
        return answer;
    }

    // Other class can change in info and score
    public void setInput(String input){
        this.input=input;
    }
    public void setAnswer(int answer){
        this.answer=answer;
    }
}
