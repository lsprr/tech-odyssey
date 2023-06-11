import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setVisible(true); // sets the x-dimension, and y-dimension of frame
        this.setSize(600, 600); // make frame visible
        this.setTitle("JFrame title goes here"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resized

        ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(255, 255, 255)); //change color of background
    }

}
