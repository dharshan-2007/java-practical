import java.awt.*;
import javax.swing.*;
public class EllipseDraw extends JFrame {
    public EllipseDraw() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(50, 50, 200, 100); // Ellipse
    }
    public static void main(String[] args) {
        new EllipseDraw();
    }
}
