import javax.swing.JPanel;
import javax.swing.JButton;

public class Panel2 extends JPanel {

    public Panel2() {
        // Create components for Panel1
        JButton button1 = new JButton("Button 3");
        JButton button2 = new JButton("Button 4");

        // Add the components to Panel1
        add(button1);
        add(button2);
    }
}
