import javax.swing.*;	
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel4 extends JPanel {

    public Panel4() {
        // Create buttons and attach action listeners using iteration
        for (int i = 1; i <= 12; i++) {
            JButton button = new JButton("Button " + i);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Button action
                    String buttonText = button.getText();
                    System.out.println(buttonText + " north clicked");
                }
            });
            add(button);
        }
    }
}
