import java.awt.*;
import javax.swing.*;
public class RectangleDraw extends JFrame {
    public RectangleDraw() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(60, 60, 180, 80); // Rectangle
    }
    public static void main(String[] args) {
        new RectangleDraw();
    }
}
