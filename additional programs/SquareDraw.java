import java.awt.*;
import javax.swing.*;
public class SquareDraw extends JFrame {
    public SquareDraw() {
        setSize(250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(80, 80, 80, 80); // Square
    }
    public static void main(String[] args) {
        new SquareDraw();
    }
}
