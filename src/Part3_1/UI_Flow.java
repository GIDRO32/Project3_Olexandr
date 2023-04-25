package Part3_1;
import javax.swing.*;
import java.awt.*;

public class UI_Flow extends JFrame {

    public UI_Flow() {
        super("Ugly User Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());

        // Add components to flowPanel
        flowPanel.add(new JLabel("Welcome to our App!"));
        flowPanel.add(Box.createRigidArea(new Dimension(50, 0))); // Adds a rigid space between components
        flowPanel.add(new JTextField(10));
        flowPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        flowPanel.add(new JButton("Click me!"));
        flowPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        flowPanel.add(new JCheckBox("I agree to the terms and conditions"));
        flowPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        flowPanel.add(new JLabel("Choose your gender:"));
        flowPanel.add(new JRadioButton("Male"));
        flowPanel.add(new JRadioButton("Female"));
        flowPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        flowPanel.add(new JButton("Submit"));

        // Add flowPanel to frame
        add(flowPanel);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_Flow();
    }
}
