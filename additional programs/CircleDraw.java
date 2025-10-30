import java.awt.*;
import javax.swing.*;
public class CircleDraw extends JFrame {
    public CircleDraw() {
        setSize(250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(60, 60, 100, 100); // Circle
    }
    public static void main(String[] args) {
        new CircleDraw();
    }
}
