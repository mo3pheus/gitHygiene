package graphics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends JComponent {
    private Logger logger         = LoggerFactory.getLogger(Circle.class);
    private int    frameWidth     = 0;
    private Color  componentColor = null;

    public Circle(int frameWidth) {
        this.frameWidth = frameWidth;
        this.setBounds(10, 10, frameWidth, frameWidth);
        this.componentColor = Color.BLACK;
    }

    public Circle(Color componentColor) {
        this.componentColor = componentColor;
        this.frameWidth = 200;
        this.setBounds(50, 50, frameWidth, frameWidth);
    }

    @Override
    public void paintComponent(Graphics g) {
        Ellipse2D ellipse2D = new Ellipse2D.Double(0, 0, frameWidth, frameWidth);
        g.setColor(componentColor);
        ellipse2D.setFrame(new Rectangle2D.Double(0, 0, frameWidth, frameWidth));

        Graphics2D g2 = (Graphics2D) g;
        g2.draw(ellipse2D);
        g2.fill(ellipse2D);
        logger.debug("Circle drawn!");
    }
}
