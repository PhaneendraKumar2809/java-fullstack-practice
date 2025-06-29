import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class myapplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(1, 1, 10, 10); // Draw a line from (1,1) to (100,100)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new myapplet());
        frame.setVisible(true);
    }
}
