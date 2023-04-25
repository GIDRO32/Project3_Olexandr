package Part3_1;

import javax.swing.*;
import java.awt.*;

public class UI_Box extends JFrame {

    public UI_Box() {
        super("GIDRO app");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for BoxLayout
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));

        // Add components to boxPanel
        boxPanel.add(Box.createVerticalGlue());
        boxPanel.add(new JLabel("Welcome to our App!"));
        boxPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        boxPanel.add(new JButton("Throw a bomb on Russia!"));
        boxPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        boxPanel.add(new JTextField(20));
        boxPanel.add(Box.createVerticalGlue());

        // Add boxPanel to frame
        add(boxPanel);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_Box();
    }
}

