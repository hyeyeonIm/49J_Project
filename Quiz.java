import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//Quiz1
public class Quiz extends math_quiz{
    // Static valuable to add and save score of a player
    answer aa = new answer();
    // input and answer for quiz1
    public JTextField inputq1 = new JTextField();
    public String answerq1 = "";

    public static int SCORE = 0;

    public JRadioButton tfInputList[] = new JRadioButton [4];
    public String tfAnswerList[] = new String [4];

    //answer var
    public int answer_1;
    public int answer_2;
    public int answer_3;
    public ArrayList<Integer> arr;
    public int answer_4;
    public int answer_5;
    public int answer_6;
    public int answer_7;
    public int answer_8;

    public Quiz() {
        setTitle("Quiz1");
        
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //jake test
                // System.out.println(inputq1.getText());
                if(answerq1.equals(inputq1.getText())){SCORE++;}
                // Change Frame
                // Call Quiz2 and Quiz2 extends math_quiz. So, we have to create object
                Quiz2 q2 = new Quiz2(); 
                q2.random(); // generate num1 num2
                q2.question(); // generate quiz with num1 num2, and answer
                q2.answer(); //compare
                // q2.score(input1,answer1);
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel(num1+" + "+num2+" = ?") ; // question
        jPanel.add(question, BorderLayout.EAST);
        answer_1 = num2 + num1;
        aa.setAnswer(answer_1);
        answerq1 = Integer.toString(answer_1);

    }
    String answer1 = String.valueOf(aa.getAnswer());

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        jPanel.add(answer, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }

// Quiz2
class Quiz2 extends math_quiz{
    public Quiz2() {
        setTitle("Quiz2");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aa.setInput(answer.getText());
                String input2 = aa.getInput();
                String answer2 = String.valueOf(aa.getAnswer());
                // if (input2.equals(answer2)){SCORE++;}
                // Change Frame
                Quiz3 q3 = new Quiz3(); 
                q3.random();
                q3.question();
                q3.answer();
                q3.score(input2,answer2);
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel(num2+" - "+num1+" = ?") ; // question
        jPanel.add(question, BorderLayout.EAST);
        add(jPanel);
        answer_2 = num2 - num1;
        aa.setAnswer(answer_2);
    }


    @Override
    public void answer() {
        // TODO Auto-generated method stub
        jPanel.add(answer, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }
}

// Quiz3
class Quiz3 extends math_quiz implements quiz_interface{
    public Quiz3() {
        setTitle("Quiz3");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aa.setInput(answer.getText());
                String input3 = aa.getInput();
                String answer3 = String.valueOf(aa.getAnswer());
                // Change Frame
                Quiz4 q4 = new Quiz4(); 
                q4.random();
                q4.question();
                q4.answer();
                q4.score(input3,answer3);
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stu
        JLabel question = new JLabel(num1+" ! = ?") ; // question
        jPanel.add(question, BorderLayout.EAST);
        add(jPanel);
        answer_3 = Factorial.multiplyNumbers(num1);
        aa.setAnswer(answer_3);
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        jPanel.add(answer, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }

    String answer3 = String.valueOf(aa.getAnswer());
    @Override
    public void score(String input2, String answer2){
        if(input2.equals(answer2)){
            SCORE++;
        }
    }
}

// Quiz4
class Quiz4 extends math_quiz implements quiz_interface{
    public Quiz4() {
        setTitle("Quiz4");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aa.setInput(answer.getText());
                String input4 = aa.getInput();
                String answer4 = String.valueOf(aa.getAnswer());
                // Change Frame
                // Call Quiz5 and Quiz5 extends tf_quiz. So, we have to create object
                Quiz5 q5 = new Quiz5(); 
                q5.score(input4,answer4);
                tfAnswerList[0] = q5.question();
                tfInputList[0] = q5.trueButton;
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("What is the smallest prime number between "+num1+" and "+ num2+" = ?") ; // question
        jPanel.add(question, BorderLayout.EAST);
        add(jPanel);
        arr = PrimeNumber.Primenumber(num1, num2);
        answer_4 = arr.get(0);
        aa.setAnswer(answer_4);

    }


    @Override
    public void answer() {
        // TODO Auto-generated method stub
        jPanel.add(answer, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }

    String answer4 = String.valueOf(aa.getAnswer());
    @Override
    public void score(String input3, String answer3){
        if(input3.equals(answer3)){
            SCORE++;
        }
    }
}
///////////////////////
//    QUIZ 5 ~ 8    //
//////////////////////

// Quiz5
class Quiz5 extends tf_quiz implements quiz_interface{
    public Quiz5() {
        setTitle("Quiz5");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                // Call Quiz6 and Quiz6 extends tf_quiz. So, we have to create object
                Quiz6 q6 = new Quiz6(); 
                tfAnswerList[1] = q6.question();
                tfInputList[1] = q6.trueButton;
                String answer5 = String.valueOf(tfInputList[0].isSelected());
                q6.score(answer5,"true");
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public String question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("You can call a static method importing its class, but without creating an object") ; // question
        jPanel.add(question, BorderLayout.NORTH);
        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
        return "true";
    }
    @Override
    public void score(String input4, String answer4){
        if(input4.equals(answer4)){
            // System.out.println(input4);
            // System.out.println(answer4);
            SCORE++;
            // System.out.println(SCORE);
        }
    }
}

// Quiz6
class Quiz6 extends tf_quiz implements quiz_interface{
    public Quiz6() {
        setTitle("Quiz6");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                Quiz7 q7 = new Quiz7(); 
                q7.question();
                tfAnswerList[2] = q7.question();
                tfInputList[2] = q7.trueButton;
                String answer6 = String.valueOf(tfInputList[1].isSelected());
                q7.score(answer6,"false");
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public String question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("You can call a static method importing its class, and creating at least one instance of its object") ; // question
        jPanel.add(question, BorderLayout.NORTH);
        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
        return "false";
    }

    @Override
    public void score(String input, String answer){
        if(input.equals(answer)){
            // System.out.println("5번 정답");
            SCORE++;
        }
    }
}

// Quiz6
class Quiz7 extends tf_quiz implements quiz_interface{
    public Quiz7() {
        setTitle("Quiz7");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                Quiz8 q8 = new Quiz8(); 
                q8.question();
                tfAnswerList[3] = q8.question();
                tfInputList[3] = q8.trueButton;
                String answer7 = String.valueOf(tfInputList[2].isSelected());
                q8.score(answer7,"false");
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public String question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("This code will work -> String height = 30") ; // question
        jPanel.add(question, BorderLayout.NORTH);
        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
        return "false";
    }
    @Override
    public void score(String input, String answer){
        if(input.equals(answer)){
            // System.out.println("6번 정답");
            SCORE++;
        }
    }
}
// Quiz8
class Quiz8 extends tf_quiz implements quiz_interface{
    public Quiz8() {
        setTitle("Quiz8");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer8 = String.valueOf(tfInputList[3].isSelected());
                if (answer8.equals("true") ){
                    // System.out.println("6번 정답");
                    SCORE++;
                }
                // // print test
                // for (JRadioButton j: tfInputList) {
                //     System.out.print("퀴즈5-8 인풋");
                //     System.out.println(j.isSelected());
                // }
                // for (String j: tfAnswerList) {
                //     System.out.print("퀴즈5-8 정답");
                //     System.out.println(j);
                // }
                // test end

                // SAVE SCORE in a File
                String save_score = String.valueOf(SCORE);
                try (FileWriter f = new FileWriter("player.txt", true);
                        BufferedWriter b = new BufferedWriter(f);
                        PrintWriter p = new PrintWriter(b);) {
                    
                    p.print(save_score);

                } catch (IOException i) {
                    i.printStackTrace();
                }
                new Ranking(); // Go to Ranking System
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public String question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("In terms of Time complexity, O(2^n) > O(n^2). ") ; // question
        jPanel.add(question, BorderLayout.NORTH);
        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
        return "true";
    }

    @Override
    public void score(String input, String answer){
        if(input.equals(answer)){
            // System.out.println("7번 정답");
            SCORE++;
        }
    }
    }
}