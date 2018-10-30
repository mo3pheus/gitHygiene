package graphics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends JComponent {
    private Logger logger = LoggerFactory.getLogger(Square.class);

    public Square(int frameWidth) {
        this.setBounds(0, 0, frameWidth, frameWidth);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D  g2          = (Graphics2D) g;
        Rectangle2D rectangle2D = new Rectangle2D.Double(100, 100, 200, 200);
        g2.setColor(Color.BLUE);
        g2.fill(rectangle2D);
        logger.debug("Square paint method called.");
    }
}
