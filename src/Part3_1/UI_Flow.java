package Part3_1;
import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

    public UI() {
        super("GIDRO's app");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        JPanel borderPanel = new JPanel(new BorderLayout());

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
        borderPanel.add(new JLabel("Header"), BorderLayout.NORTH);
        borderPanel.add(new JLabel("Footer"), BorderLayout.SOUTH);
        borderPanel.add(new JTextField(20), BorderLayout.WEST);
        borderPanel.add(new JTextField(20), BorderLayout.EAST);
        borderPanel.add(new JTextArea("Welcome to our App!"), BorderLayout.CENTER);

        // Add flowPanel to frame
        add(flowPanel);
        add(borderPanel);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI();
    }
}
