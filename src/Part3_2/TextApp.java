package Part3_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextApp extends JFrame implements ActionListener {
    private JTextField textField1, textField2, textField3;

    public TextApp() {
        // Set up the main window
        setTitle("Text Circulation App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Create the text fields
        textField1 = new JTextField("Enter text here", 20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        textField2.setEditable(false);
        textField3.setEditable(false);

        // Create the buttons
        JButton button1 = new JButton("Copy to Text Field 2");
        JButton button2 = new JButton("Copy to Text Field 3");

        // Add action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);

        // Set up the layout
        setLayout(new GridLayout(4, 1));
        add(textField1);
        add(button1);
        add(button2);
        add(Box.createVerticalGlue());
        add(textField2);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(textField3);

        // Show the window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Copy to Text Field 2")) {
            String text = textField1.getText();
            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter some text in the first field.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                textField2.setText(text);
                JOptionPane.showMessageDialog(this, "Text copied to Text Field 2.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getActionCommand().equals("Copy to Text Field 3")) {
            String text = textField2.getText();
            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please copy some text to the second field first.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                textField3.setText(text);
                int response = JOptionPane.showConfirmDialog(this, "Do you want to clear the first and second fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    textField1.setText("");
                    textField2.setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        new TextApp();
    }
}

