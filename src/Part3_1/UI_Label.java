package Part3_1;

import javax.swing.*;
import java.awt.*;

public class UI_Label extends JFrame {

    public UI_Label() {
        super("Ugly User Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for Label component
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));

        // Add labels to labelPanel
        labelPanel.add(new JLabel("Welcome!"));
        labelPanel.add(Box.createRigidArea(new Dimension(0, 10))); // add 10 pixel spacing
        labelPanel.add(new JLabel("Please enter your login information below:"));
        labelPanel.add(Box.createRigidArea(new Dimension(0, 10))); // add 10 pixel spacing
        labelPanel.add(new JLabel("Username:"));
        labelPanel.add(Box.createRigidArea(new Dimension(0, 5))); // add 5 pixel spacing
        labelPanel.add(new JLabel("Password:"));
        labelPanel.add(Box.createRigidArea(new Dimension(0, 10))); // add 10 pixel spacing
        labelPanel.add(new JButton("Login"));

        // Add labelPanel to frame
        add(labelPanel, BorderLayout.CENTER);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_Label();
    }
}

