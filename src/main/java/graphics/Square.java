package graphics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends JComponent {
    private Logger logger     = LoggerFactory.getLogger(Square.class);
    private int    frameWidth = 0;
    private Color  color      = null;

    public Square(int frameWidth) {
        this.frameWidth = frameWidth;
        this.setBounds(0, 0, frameWidth, frameWidth);
    }

    public Square(Color color) {
        this.color = color;
        this.frameWidth = 200;
        this.setBounds(0, 0, frameWidth, frameWidth);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D  g2          = (Graphics2D) g;
        Rectangle2D rectangle2D = new Rectangle2D.Double(100, 100, 200, 200);
        g2.setColor(color);
        g2.fill(rectangle2D);
        logger.debug("Square paint method called.");
    }
}
