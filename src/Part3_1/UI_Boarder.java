package Part3_1;

import javax.swing.*;
import java.awt.*;

public class UI_Boarder extends JFrame {

    public UI_Boarder() {
        super("GIDRO app 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());

        // Add components to borderPanel
        borderPanel.add(new JLabel("Header"), BorderLayout.NORTH);
        borderPanel.add(new JLabel("Footer"), BorderLayout.SOUTH);
        borderPanel.add(new JTextField(20), BorderLayout.WEST);
        borderPanel.add(new JTextField(20), BorderLayout.EAST);
        borderPanel.add(new JTextArea("Welcome to our App!"), BorderLayout.CENTER);

        // Add borderPanel to frame
        add(borderPanel);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_Boarder();
    }
}

