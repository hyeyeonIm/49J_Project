import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

//Quiz1
public class Quiz extends math_quiz{

    Player player1 = new Player();

    public Quiz() {
        setTitle("Quiz1");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                // Call Quiz2 and Quiz2 extends math_quiz. So, we have to create object
                Quiz2 q2 = new Quiz2(); 
                q2.question();
                q2.answer();
                // new Ranking_System(); // create new object
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("1 + 1 ?") ; // question
        jPanel.add(question, BorderLayout.EAST);
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        JTextField answer = new JTextField("          ") ; // answer
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
                // Change Frame
                // Call Quiz1 and Quiz1 extends math_quiz. So, we have to create object
                Quiz3 q3 = new Quiz3(); 
                q3.question();
                q3.answer();
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("2 + 2 ?") ; // question
        jPanel.add(question, BorderLayout.EAST);
        add(jPanel);
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        JTextField answer = new JTextField("          ") ; // answer
        jPanel.add(answer, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }
}

// Quiz3
class Quiz3 extends math_quiz{
    public Quiz3() {
        setTitle("Quiz3");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                // Call Quiz2 and Quiz2 extends math_quiz. So, we have to create object
                Quiz4 q4 = new Quiz4(); 
                q4.question();
                q4.answer();
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("3 + 3 ?") ; // question
        jPanel.add(question, BorderLayout.EAST);
        add(jPanel);
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        JTextField answer = new JTextField("          ") ; // answer
        jPanel.add(answer, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }
}

// Quiz4
class Quiz4 extends math_quiz{
    public Quiz4() {
        setTitle("Quiz4");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                // Call Quiz2 and Quiz2 extends math_quiz. So, we have to create object
                Quiz5 q5 = new Quiz5(); 
                q5.question();
                // new Ranking_System(); // create new object
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("4 + 4 ?") ; // question
        jPanel.add(question, BorderLayout.EAST);
        add(jPanel);
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        JTextField answer = new JTextField("          ") ; // answer
        jPanel.add(answer, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }
}
///////////////////////
// MAKE OTHER QUIZS //
//////////////////////

// Quiz5
class Quiz5 extends tf_quiz{
    public Quiz5() {
        setTitle("Quiz5");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                // Call Quiz2 and Quiz2 extends math_quiz. So, we have to create object
                Quiz6 q6 = new Quiz6(); 
                q6.question();
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("Q5: Haley is woman") ; // question
        jPanel.add(question, BorderLayout.NORTH);
        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }
}

// Quiz6
class Quiz6 extends tf_quiz{
    public Quiz6() {
        setTitle("Quiz6");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                // Call Quiz2 and Quiz2 extends quizframe1. So, we have to create object
                Quiz7 q7 = new Quiz7(); 
                q7.question();
                // new Ranking_System(); // create new object
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("Q6: Haley is woman") ; // question
        jPanel.add(question, BorderLayout.NORTH);
        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }
}

// Quiz6
class Quiz7 extends tf_quiz{
    public Quiz7() {
        setTitle("Quiz7");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change Frame
                // Call Quiz2 and Quiz2 extends quizframe1. So, we have to create object
                Quiz8 q8 = new Quiz8(); 
                q8.question();
                // new Ranking_System(); // create new object
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("Q7: Haley is woman") ; // question
        jPanel.add(question, BorderLayout.NORTH);
        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }
}
// Quiz8
class Quiz8 extends tf_quiz{
    public Quiz8() {
        setTitle("Quiz8");
        // Button Action : click the button, move to next quiz
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ranking(); // Go to Ranking System
                setVisible(false); // invisible
            }
        });
    }
    @Override
    public void question() {
        // TODO Auto-generated method stub
        JLabel question = new JLabel("Q8: Haley is woman") ; // question
        jPanel.add(question, BorderLayout.NORTH);
        //Register a listener for the radio buttons.
        jPanel.add(trueButton, BorderLayout.WEST);
        jPanel.add(falseButton, BorderLayout.WEST);
        jPanel.add(btn2, BorderLayout.SOUTH);
        add(jPanel);
    }
    }
}