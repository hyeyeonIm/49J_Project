import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;

public class inputpage extends JFrame implements ActionListener {
    JPanel panel = new JPanel() ;

    private JLabel name ;
    private JLabel major ;
    private JLabel gender ;

    private JTextField name_text ;
    private JTextField major_text ;
    private JTextField gender_text ;

    private JButton btn ; 

    public String name_info;
    public String major_info;
    public String gender_info;

    inputpage() {
    super() ;

    name = new JLabel("Name") ;
    major = new JLabel("Major") ;
    gender = new JLabel("Gender");

    name_text = new JTextField() ;
    major_text = new JTextField() ;
    gender_text = new JTextField();

    btn = new JButton("Let's go!") ;

    // vertical gap : 50
    panel.setLayout(new GridLayout(3, 4,0,150)) ;

    panel.add(name, BorderLayout.EAST) ;
    panel.add(name_text, BorderLayout.WEST) ;
    panel.add(major, BorderLayout.EAST) ;
    panel.add(major_text, BorderLayout.WEST) ; 
    panel.add(gender, BorderLayout.EAST) ;
    panel.add(gender_text, BorderLayout.WEST) ; 

    // name_text.setHorizontalAlignment(JTextField.RIGHT) ;
    // major_text.setHorizontalAlignment(JTextField.RIGHT) ;
    // gender_text.setHorizontalAlignment(JTextField.RIGHT) ;
    
    this.add(panel, BorderLayout.CENTER) ; 
    this.add(btn, BorderLayout.SOUTH) ;
    btn.addActionListener(this) ;
    
    this.setTitle("Enter your info!") ;
    this.setSize(500, 500) ;
    this.setLocation(200, 200) ;
    this.setVisible(true) ;
    this.setDefaultCloseOperation(EXIT_ON_CLOSE) ;
    }

     // Store info in textfile
     public void actionPerformed(ActionEvent ae) {
        name_info = name_text.getText();
        major_info = major_text.getText();
        gender_info = gender_text.getText();
    }

    public static void main(String[] args)  {
        inputpage user = new inputpage() ;
     }
}
