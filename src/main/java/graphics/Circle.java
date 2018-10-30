package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends JComponent {
    public Circle(int frameWidth) {
        this.setBounds(0, 0, frameWidth, frameWidth);
    }

    public void paint(Graphics g) {
        Ellipse2D ellipse2D = new Ellipse2D.Double(100, 100, 200, 200);
        g.setColor(Color.GREEN);
        ellipse2D.setFrame(new Rectangle2D.Double(100, 100, 200, 200));

        Graphics2D g2 = (Graphics2D) g;
        g2.draw(ellipse2D);
        g2.fill(ellipse2D);
    }
}
