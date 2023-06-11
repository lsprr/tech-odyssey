import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {
//        this.setVisible(true); // sets the x-dimension, and y-dimension of frame
//        this.setSize(600, 600); // make frame visible
//        this.setTitle("JFrame title goes here"); // sets title of frame
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        this.setResizable(false); //prevent frame from being resized
//
//        ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
//        this.setIconImage(image.getImage()); //change icon of frame
//        this.getContentPane().setBackground(new Color(255, 255, 255)); //change color of background

        ImageIcon icon = new ImageIcon("point.png");
        ImageIcon icon2 = new ImageIcon("face.png");

        label = new JLabel();
        button = new JButton();

        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("I am a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Hi");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
