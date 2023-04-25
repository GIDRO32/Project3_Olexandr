package Part3_1;

import javax.swing.*;
import java.awt.*;

public class UI_TextField extends JFrame {

    public UI_TextField() {
        super("Ugly User Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for TextField components
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.Y_AXIS));
        textFieldPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add text fields to textFieldPanel
        textFieldPanel.add(new JLabel("Credit card number:"));
        textFieldPanel.add(new JTextField());
        textFieldPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        textFieldPanel.add(new JLabel("CUV:"));
        textFieldPanel.add(new JTextField());
        textFieldPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        textFieldPanel.add(new JLabel("Expiration date:"));
        textFieldPanel.add(new JTextField());
        textFieldPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        textFieldPanel.add(new JLabel("Bank:"));
        textFieldPanel.add(new JTextField());

        // Add textFieldPanel to frame
        add(textFieldPanel, BorderLayout.CENTER);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_TextField();
    }
}

