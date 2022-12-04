// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.*;
// import java.awt.*;



// //First Frame
// class MainFrame extends JFrame{ 
//     JPanel jPanel = new JPanel();
    
//     private JLabel name ;
//     private JLabel major ;
//     private JLabel gender ;

//     private JTextField name_text ;
//     private JTextField major_text ;
//     private JTextField gender_text ;
    
//     // Player
//     public String name_info;
//     public String major_info;
//     public String gender_info;

//     private JButton btn1;

//     MainFrame() {

//         super("Enter your info!");

//         name = new JLabel("Name") ;
//         major = new JLabel("Major") ;
//         gender = new JLabel("Gender");

//         name_text = new JTextField() ;
//         major_text = new JTextField() ;
//         gender_text = new JTextField();

//         btn1 = new JButton("Start!");

//         setSize(500, 500); // size
//         Color color1 = new Color(198,218,214);
//         Color color2 = new Color(109,146,155);

//         jPanel.setBackground(color1);
//         btn1.setBackground(color2);

//         // vertical gap : 50
//         jPanel.setLayout(new GridLayout(3, 4,0,50)) ;

//         jPanel.add(name, BorderLayout.EAST) ;
//         jPanel.add(name_text, BorderLayout.WEST) ;
//         jPanel.add(major, BorderLayout.EAST) ;
//         jPanel.add(major_text, BorderLayout.WEST) ; 
//         jPanel.add(gender, BorderLayout.EAST) ;
//         jPanel.add(gender_text, BorderLayout.WEST) ; 
    
//         this.add(jPanel, BorderLayout.CENTER) ; 
//         this.add(btn1, BorderLayout.SOUTH) ;


//         setVisible(true);

//         // button
//         btn1.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Save info
//                 name_info = name_text.getText();
//                 major_info = major_text.getText();
//                 gender_info = gender_text.getText();

//                 // Change Frame
//                 // Call Quiz1 and Quiz1 extends quizframe1. So, we have to create object
//                 Quiz1 q1 = new Quiz1(); 
//                 q1.question();
//                 q1.answer();

//                 setVisible(false); // invisible
//             }
//         });
//     }
// }// Finish inputpage

// // Quiz1
// class Quiz1 extends quizframe1{
//     public Quiz1() {
//         setTitle("Quiz1");
//         // Button Action : click the button, move to next quiz
//         btn2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Change Frame
//                 // Call Quiz2 and Quiz2 extends quizframe1. So, we have to create object
//                 Quiz2 q2 = new Quiz2(); 
//                 q2.question();
//                 q2.answer();
//                 // new Ranking_System(); // create new object
//                 setVisible(false); // invisible
//             }
//         });
//     }
//     @Override
//     public void question() {
//         // TODO Auto-generated method stub
//         JLabel question = new JLabel("1 + 1 ?") ; // question
//         jPanel.add(question, BorderLayout.EAST);
//         add(jPanel);
//     }

//     @Override
//     public void answer() {
//         // TODO Auto-generated method stub
//         JTextField answer = new JTextField("          ") ; // answer
//         jPanel.add(answer, BorderLayout.WEST);
//         jPanel.add(btn2, BorderLayout.SOUTH);
//         add(jPanel);
//     }
// }


// // Quiz2
// class Quiz2 extends quizframe1{
//     public Quiz2() {
//         setTitle("Quiz2");
//         // Button Action : click the button, move to next quiz
        
//         btn2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Change Frame
//                 // Call Quiz1 and Quiz1 extends quizframe1. So, we have to create object
//                 Quiz3 q3 = new Quiz3(); 
//                 q3.question();
//                 q3.answer();
//                 setVisible(false); // invisible
//             }
//         });
//     }
//     @Override
//     public void question() {
//         // TODO Auto-generated method stub
//         JLabel question = new JLabel("2 + 2 ?") ; // question
//         jPanel.add(question, BorderLayout.EAST);
//         add(jPanel);
//     }

//     @Override
//     public void answer() {
//         // TODO Auto-generated method stub
//         JTextField answer = new JTextField("          ") ; // answer
//         jPanel.add(answer, BorderLayout.WEST);
//         jPanel.add(btn2, BorderLayout.SOUTH);
//         add(jPanel);
//     }
// }

// // Quiz3
// class Quiz3 extends quizframe1{
//     public Quiz3() {
//         setTitle("Quiz3");
//         // Button Action : click the button, move to next quiz
//         btn2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Change Frame
//                 // Call Quiz2 and Quiz2 extends quizframe1. So, we have to create object
//                 Quiz4 q4 = new Quiz4(); 
//                 q4.question();
//                 q4.answer();
//                 setVisible(false); // invisible
//             }
//         });
//     }
//     @Override
//     public void question() {
//         // TODO Auto-generated method stub
//         JLabel question = new JLabel("3 + 3 ?") ; // question
//         jPanel.add(question, BorderLayout.EAST);
//         add(jPanel);
//     }

//     @Override
//     public void answer() {
//         // TODO Auto-generated method stub
//         JTextField answer = new JTextField("          ") ; // answer
//         jPanel.add(answer, BorderLayout.WEST);
//         jPanel.add(btn2, BorderLayout.SOUTH);
//         add(jPanel);
//     }
// }

// // Quiz4
// class Quiz4 extends quizframe1{
//     public Quiz4() {
//         setTitle("Quiz4");
//         // Button Action : click the button, move to next quiz
//         btn2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Change Frame
//                 // Call Quiz2 and Quiz2 extends quizframe1. So, we have to create object
//                 Quiz5 q5 = new Quiz5(); 
//                 q5.question();
//                 // new Ranking_System(); // create new object
//                 setVisible(false); // invisible
//             }
//         });
//     }
//     @Override
//     public void question() {
//         // TODO Auto-generated method stub
//         JLabel question = new JLabel("4 + 4 ?") ; // question
//         jPanel.add(question, BorderLayout.EAST);
//         add(jPanel);
//     }

//     @Override
//     public void answer() {
//         // TODO Auto-generated method stub
//         JTextField answer = new JTextField("          ") ; // answer
//         jPanel.add(answer, BorderLayout.WEST);
//         jPanel.add(btn2, BorderLayout.SOUTH);
//         add(jPanel);
//     }
// }
// ///////////////////////
// // MAKE OTHER QUIZS //
// //////////////////////

// // Quiz5
// class Quiz5 extends quizframe2{
//     public Quiz5() {
//         setTitle("Quiz5");
//         // Button Action : click the button, move to next quiz
//         btn2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Change Frame
//                 // Call Quiz2 and Quiz2 extends quizframe1. So, we have to create object
//                 Quiz6 q6 = new Quiz6(); 
//                 q6.question();
//                 setVisible(false); // invisible
//             }
//         });
//     }
//     @Override
//     public void question() {
//         // TODO Auto-generated method stub
//         JLabel question = new JLabel("Q5: Haley is woman") ; // question
//         jPanel.add(question, BorderLayout.NORTH);
//         //Register a listener for the radio buttons.
//         jPanel.add(trueButton, BorderLayout.WEST);
//         jPanel.add(falseButton, BorderLayout.WEST);
//         jPanel.add(btn2, BorderLayout.SOUTH);
//         add(jPanel);
//     }
// }

// // Quiz6
// class Quiz6 extends quizframe2{
//     public Quiz6() {
//         setTitle("Quiz6");
//         // Button Action : click the button, move to next quiz
//         btn2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Change Frame
//                 // Call Quiz2 and Quiz2 extends quizframe1. So, we have to create object
//                 Quiz7 q7 = new Quiz7(); 
//                 q7.question();
//                 // new Ranking_System(); // create new object
//                 setVisible(false); // invisible
//             }
//         });
//     }
//     @Override
//     public void question() {
//         // TODO Auto-generated method stub
//         JLabel question = new JLabel("Q6: Haley is woman") ; // question
//         jPanel.add(question, BorderLayout.NORTH);
//         //Register a listener for the radio buttons.
//         jPanel.add(trueButton, BorderLayout.WEST);
//         jPanel.add(falseButton, BorderLayout.WEST);
//         jPanel.add(btn2, BorderLayout.SOUTH);
//         add(jPanel);
//     }
// }

// // Quiz6
// class Quiz7 extends quizframe2{
//     public Quiz7() {
//         setTitle("Quiz7");
//         // Button Action : click the button, move to next quiz
//         btn2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Change Frame
//                 // Call Quiz2 and Quiz2 extends quizframe1. So, we have to create object
//                 Quiz8 q8 = new Quiz8(); 
//                 q8.question();
//                 // new Ranking_System(); // create new object
//                 setVisible(false); // invisible
//             }
//         });
//     }
//     @Override
//     public void question() {
//         // TODO Auto-generated method stub
//         JLabel question = new JLabel("Q7: Haley is woman") ; // question
//         jPanel.add(question, BorderLayout.NORTH);
//         //Register a listener for the radio buttons.
//         jPanel.add(trueButton, BorderLayout.WEST);
//         jPanel.add(falseButton, BorderLayout.WEST);
//         jPanel.add(btn2, BorderLayout.SOUTH);
//         add(jPanel);
//     }
// }
// // Quiz8
// class Quiz8 extends quizframe2{
//     public Quiz8() {
//         setTitle("Quiz8");
//         // Button Action : click the button, move to next quiz
//         btn2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new Ranking_System(); // Go to Ranking System
//                 setVisible(false); // invisible
//             }
//         });
//     }
//     @Override
//     public void question() {
//         // TODO Auto-generated method stub
//         JLabel question = new JLabel("Q8: Haley is woman") ; // question
//         jPanel.add(question, BorderLayout.NORTH);
//         //Register a listener for the radio buttons.
//         jPanel.add(trueButton, BorderLayout.WEST);
//         jPanel.add(falseButton, BorderLayout.WEST);
//         jPanel.add(btn2, BorderLayout.SOUTH);
//         add(jPanel);
//     }
// }


// // Ranking System
// class Ranking_System extends JFrame{
//     Ranking_System() {
//         super("RANKING");

//         JPanel jPanel = new JPanel();
//         JButton btn3 = new JButton("AGAIN");
//         JButton btn4 = new JButton("END");

//         setSize(500, 500); // size
//         Color color1 = new Color(198,218,214);
//         Color color2 = new Color(109,146,155);

//         jPanel.setBackground(color1);

//         jPanel.add(btn3);
//         jPanel.add(btn4);
//         jPanel.add(btn3, BorderLayout.WEST) ;
//         jPanel.add(btn3, BorderLayout.EAST) ;

//         btn3.setBackground(color2);
//         btn4.setBackground(color2);
//         add(jPanel);

//         setVisible(true);
        
//         btn3.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new MainFrame(); // Go MainFrame
//                 setVisible(false); // invisible
//             }
//         });

//         btn4.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 System.exit(0); // exit
//             }
//         });
// }

// }
    
// //Main
// public class allpage {
//     public static void main(String[] args) {
//         new MainFrame();
//     }
// } 