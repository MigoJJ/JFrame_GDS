import javax.swing.JPanel;
import javax.swing.JButton;

public class Panel1 extends JPanel {

    public Panel1() {
        // Create components for Panel1
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Add the components to Panel1
        add(button1);
        add(button2);
    }
}
