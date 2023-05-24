import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Panel3 extends JPanel {
	    public Panel3() {
	        // Create buttons and attach action listeners using iteration
	        for (int i = 1; i <= 12; i++) {
	            JButton button = new JButton("Button " + i);
	            button.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    // Button action
	                    String buttonText = button.getText();
	                    System.out.println(buttonText + " south clicked");
	                }
	            });
	            add(button);
	        }
	    }
	}
