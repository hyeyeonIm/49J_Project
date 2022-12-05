public class answer {
    // input is player's input
    private String input="";
    // answer is quiz answer
    private int answer=0;

    // Other classes can get input and answer
    public String getInput(){
        return input;
    }
    public int getAnswer(){
        return answer;
    }

    // Other class can change input and answer
    public void setInput(String input){
        this.input=input;
    }
    public void setAnswer(int answer){
        this.answer=answer;
    }
}
