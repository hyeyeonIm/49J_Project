import java.awt.*; // for graphic 
import java.awt.event.*; // for event
import javax.swing.*; // for swing components path
import javax.swing.event.*; // for swing events path
// import java.util.Timer;
// import java.util.TimerTask;
// import javax.swing.Timer;

//abstract
public abstract class QuizFrame{
   public String title;

   //init gui
   public static void GUIFrame(String quiz_num) {
      JFrame frame = new JFrame("quiz");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame exit and quit program when press the  x button
      frame.setSize(500,500); // set the jframe size 
      frame.getContentPane().setBackground(Color.ORANGE); // same 
   //    frame.getContentPane().setLayout(new FlowLayout()); // how to set the layout for componets

     //  JButton button_1 = new JButton("Press");
      JButton button_2 = new JButton("Enter");
     //  JButton button_3 = new JButton("MINSE CODE");
     frame.getContentPane().setLayout(new GridLayout(3,2,5,5)); 
      
       
      // Adds Button to content pane of frame

     //  frame.getContentPane().add(button_1, BorderLayout.WEST); // Adds Button to content pane of frame
     //  frame.getContentPane().add(button_2, BorderLayout.EAST); // Adds Button to content pane of frame
     //  frame.getContentPane().add(button_3, BorderLayout.CENTER); // Adds Button to content pane of frame
     // frame.getContentPane().add(new JTextField("")).setSize(300, 200);
     frame.getContentPane().add(new JLabel(quiz_num));
     frame.getContentPane().add(new JLabel(" 1 + 1 = ?"));
     frame.getContentPane().add(new JLabel(" answer"));
     frame.getContentPane().add(new JTextField("")).setSize(300, 200);
     frame.getContentPane().add(new JButton("Enter")); // Adds Button to content pane of frame
   
     frame.setVisible(true);
   }

   // public static void TimeLimit(){
   // }

// init the frame of gui
    public static void main(String args[]){
         GUIFrame("quiz 100");

      }
   
   // // Default setting : make a Jframe, and pannel
   // JFrame frame = new JFrame("My First GUI Dummy");

   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame exit and quit program when press the  x button
   // frame.setSize(3000,300); // set the jframe size 
   // frame.getContentPane().setBackground(Color.ORANGE); // same 
   
   // // built container
   
   // // set the components layout
   // frame.getContentPane().setLayout(new GridLayout());
   // frame.getContentPane().add(new JLable("add ur input.."));
   // frame.getContentPane().add(new JTextField(""));
   // frame.setVisible(true); // to show the frame : at the last
   // }
}

