package Part3_1;

import javax.swing.*;
import java.awt.*;

public class UI_BoxRigid extends JFrame {

    public UI_BoxRigid() {
        super("GIDRO app 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel with FlowLayout and add components
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JLabel("Username:"));
        flowPanel.add(new JTextField());
        flowPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        flowPanel.add(new JLabel("Password:"));
        flowPanel.add(new JPasswordField());
        flowPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        flowPanel.add(new JButton("Login"));

        // Add flowPanel to frame
        add(flowPanel);

        // Display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UI_BoxRigid();
    }
}

