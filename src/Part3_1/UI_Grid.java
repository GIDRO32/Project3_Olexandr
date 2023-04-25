package Part3_1;

import javax.swing.*;
import java.awt.*;

public class UI_Grid extends JFrame {

    public UI_Grid() {
        super("GIDRO app 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for GridLayout
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 3, 10, 10)); // 3 rows, 3 columns, 10 pixel spacing

        // Add components to gridPanel
        gridPanel.add(new JLabel("Username:"));
        gridPanel.add(new JTextField(20));
        gridPanel.add(new JLabel("Password:"));
        gridPanel.add(new JPasswordField(20));
        gridPanel.add(new JLabel("Email:"));
        gridPanel.add(new JTextField(20));
        gridPanel.add(new JLabel("Phone:"));
        gridPanel.add(new JTextField(20));
        gridPanel.add(new JButton("Submit"));

        // Add gridPanel to frame
        add(gridPanel, BorderLayout.CENTER);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_Grid();
    }
}

