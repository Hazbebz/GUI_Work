/*
 Basic implementation of a GUI with Button to repsond to cliks and a method to listen
 and increment the click counter
 */

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI implements ActionListener{//gui object

    private int count = 0;
    //all basic setup
    private JLabel  label;
    private JFrame frame; 
    private JButton button;
    private JPanel panel;

    public GUI(){

        frame = new JFrame();//basiclally just the window
        panel = new JPanel();//panel acts as a layout for the window
        button = new JButton("Click me");

        button.addActionListener(this);

        label = new JLabel("Number of clicks : 0 ");

        //must add all buttons/labels to the panel 
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));//initial size
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);//add paenl to the frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set what happens on frame closure 
        frame.setTitle("Our GUI");//set title for frame
        frame.pack();//set the window yo fit a certain size
        frame.setVisible(true);

    }
    public static void main(String[] args){
        new GUI();//creates new Gui object 
    }

    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of clicks: "+ count);
    }
}