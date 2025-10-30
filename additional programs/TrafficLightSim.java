import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TrafficLightSim extends JFrame {
    JLabel msg;
    public TrafficLightSim() {
        setLayout(new FlowLayout());
        JButton red = new JButton("Red");
        JButton yellow = new JButton("Yellow");
        JButton green = new JButton("Green");
        msg = new JLabel("Press a button");
        add(red); add(yellow); add(green); add(msg);
        red.addActionListener(e -> msg.setText("Stop"));
        yellow.addActionListener(e -> msg.setText("Ready"));
        green.addActionListener(e -> msg.setText("Go"));
        setSize(300, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TrafficLightSim();
    }
}
