package graphics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends JComponent {
    private Logger logger = LoggerFactory.getLogger(Circle.class);

    public Circle(int frameWidth) {
        this.setBounds(0, 0, frameWidth, frameWidth);
    }

    @Override
    public void paintComponent(Graphics g) {
        Ellipse2D ellipse2D = new Ellipse2D.Double(100, 100, 200, 200);
        g.setColor(Color.GREEN);
        ellipse2D.setFrame(new Rectangle2D.Double(100, 100, 200, 200));

        Graphics2D g2 = (Graphics2D) g;
        g2.draw(ellipse2D);
        g2.fill(ellipse2D);
        logger.debug("Circle drawn!");
    }
}
