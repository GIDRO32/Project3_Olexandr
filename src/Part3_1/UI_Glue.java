package Part3_1;

import javax.swing.*;
import java.awt.*;

public class UI_Glue extends JFrame {

    public UI_Glue() {
        super("Ugly User Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel with BoxLayout and add components
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(Box.createVerticalGlue()); // add glue to top of panel
        boxPanel.add(new JLabel("Enter your opinion here:"));
        boxPanel.add(Box.createRigidArea(new Dimension(0, 10))); // add fixed vertical spacing
        boxPanel.add(new JTextField());
        boxPanel.add(Box.createVerticalGlue()); // add glue to center of panel
        boxPanel.add(new JButton("Submit"));
        boxPanel.add(Box.createVerticalGlue()); // add glue to bottom of panel

        // Add boxPanel to frame
        add(boxPanel);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_Glue();
    }
}

