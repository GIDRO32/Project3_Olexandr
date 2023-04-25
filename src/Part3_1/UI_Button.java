package Part3_1;

import javax.swing.*;
import java.awt.*;

public class UI_Button extends JFrame {

    public UI_Button() {
        super("Gidro app 6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for Button components
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add buttons to buttonPanel
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("2"));
        buttonPanel.add(new JButton("3"));
        buttonPanel.add(new JButton("+"));
        buttonPanel.add(new JButton("4"));
        buttonPanel.add(new JButton("5"));
        buttonPanel.add(new JButton("6"));
        buttonPanel.add(new JButton("-"));
        buttonPanel.add(new JButton("7"));
        buttonPanel.add(new JButton("8"));
        buttonPanel.add(new JButton("9"));
        buttonPanel.add(new JButton("*"));
        buttonPanel.add(new JButton("C"));
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(new JButton("="));
        buttonPanel.add(new JButton("/"));

        // Add buttonPanel to frame
        add(buttonPanel, BorderLayout.CENTER);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_Button();
    }
}

