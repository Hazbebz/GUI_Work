import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI implements ActionListener{
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label; 
    private static JTextField userText;

    private static JLabel password;
    private static JPasswordField passwordTxt;

    private static JButton submit; 
    private static JLabel success; 


    public static void main(String[] args){
        frame = new JFrame();//basiclally just the window
        panel = new JPanel();

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        panel.setLayout(null);
        //username fields
        label = new JLabel("Username");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(100, 20 ,165 ,25);
        panel.add(userText);
        //end user fields

        //password fields
        password = new JLabel("Password");
        password.setBounds(10, 50, 80, 25);
        panel.add(password);

        /*
        //Displays the text unhidden
        JTextField userPass = new JTextField(20);
        userPass.setBounds(100, 50, 165, 25);
        panel.add(userPass);
        */

        passwordTxt = new JPasswordField();
        passwordTxt.setBounds(100, 50, 165, 25);
        panel.add(passwordTxt);
        //end passwrod fields 

        submit = new JButton("Login");
        submit.setBounds(10,80,80,25);
        submit.addActionListener(new LoginGUI());
        panel.add(submit);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        success.setText("");

        frame.setVisible(true);//always keep at end 
    }

    public void actionPerformed(ActionEvent e){
        String user = userText.getText();
        String password = passwordTxt.getText(); 

        if(user.equals("harry") && password.equals("69420"));
        {
            success.setText("Correct password entered");
        }
    }
}