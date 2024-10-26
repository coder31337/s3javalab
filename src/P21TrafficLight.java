import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JPanel implements ActionListener {
    private final JRadioButton stopBtn, goBtn, slowBtn;
    private Color redBulb, greenBulb, orangeBulb;

    public TrafficLight() {
        setBounds(0, 0, 600, 300);
        stopBtn = new JRadioButton("Stop");
        goBtn =   new JRadioButton("Go");
        slowBtn = new JRadioButton("Slow");
        stopBtn.setSelected(true);

        ButtonGroup group = new ButtonGroup();
        group.add(stopBtn);
        group.add(goBtn);
        group.add(slowBtn);
        add(stopBtn);
        add(goBtn);
        add(slowBtn);
        stopBtn.addActionListener(this);
        goBtn.addActionListener(this);
        slowBtn.addActionListener(this);

        redBulb = Color.red;
        greenBulb = getBackground();
        orangeBulb = getBackground();
    }

    public void actionPerformed(ActionEvent event) {
        if (stopBtn.isSelected()) {
            redBulb = Color.red;
            greenBulb = getBackground();
            orangeBulb = getBackground();
        } else if (goBtn.isSelected()) {
            redBulb = getBackground();
            greenBulb = Color.green;
            orangeBulb = getBackground();
        } else if (slowBtn.isSelected()) {
            redBulb = getBackground();
            greenBulb = getBackground();
            orangeBulb = Color.orange;
        }
        repaint();
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawOval(50, 50, 50, 50);
        graphics.drawOval(50, 110, 50, 50);
        graphics.drawOval(50, 170, 50, 50);
        graphics.setColor(redBulb);
        graphics.fillOval(50, 50, 50, 50);
        graphics.setColor(orangeBulb);
        graphics.fillOval(50, 110, 50, 50);
        graphics.setColor(greenBulb);
        graphics.fillOval(50, 170, 50, 50);
    }
}

public class P21TrafficLight {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light");
        TrafficLight trafficLight = new TrafficLight();
        frame.setSize(600, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(trafficLight);
        frame.setVisible(true);
    }
}
