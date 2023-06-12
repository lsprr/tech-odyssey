import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    JTextField text;
    JCheckBox checkbox;
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    JComboBox comboBox;

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
        ImageIcon xIcon = new ImageIcon("X.png");
        ImageIcon checkIcon = new ImageIcon("checkmark.png");
        ImageIcon pizzaIcon = new ImageIcon("pizza.png");
        ImageIcon hamburgerIcon = new ImageIcon("hamburger.png");
        ImageIcon hotdogIcon = new ImageIcon("hotdog.png");

        label = new JLabel();
        button = new JButton();
        text = new JTextField();

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

        text.setPreferredSize(new Dimension(250, 40));
        text.setFont(new Font("Consolas", Font.PLAIN, 35));
        text.setForeground(Color.GREEN);
        text.setBackground(Color.BLACK);
        text.setCaretColor(Color.WHITE);
        text.setText("username");

        checkbox.setText("I am not a robot");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkbox.setIcon(xIcon);
        checkbox.setSelectedIcon(checkIcon);

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        String[] animals = {"dog", "cat", "bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);
        comboBox.getItemCount();
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("horse");
        comboBox.removeItemAt(0);
        comboBox.removeAllItems();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        this.add(text);
        this.add(checkbox);
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.add(comboBox);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Hi");
            button.setEnabled(false);
            label.setVisible(true);
            System.out.println("Welcome "+text.getText());
            text.setEditable(false);
            System.out.println(checkbox.isSelected());
        }

        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }

        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
