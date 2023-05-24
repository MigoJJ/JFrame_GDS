import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("My Frame");
        setSize(1200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 2));

        // Create an instance of Panel1 class
        Panel1 panel1 = new Panel1();

        // Create an instance of Panel2 class
        Panel2 panel2 = new Panel2();

        // Add panel1 and panel2 to the gridPanel
        gridPanel.add(panel1);
        gridPanel.add(panel2);

        // Add the gridPanel to the center of the JFrame using BorderLayout
        add(gridPanel, BorderLayout.CENTER);

        // Create an instance of Panel3 class
        Panel3 panel3 = new Panel3();

        // Add panel3 to the south region of the JFrame
        add(panel3, BorderLayout.SOUTH);
        
        // Create an instance of Panel4 class
        Panel4 panel4 = new Panel4();

        // Add panel4 to the north region of the JFrame
        add(panel4, BorderLayout.NORTH);

        // Display the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
