package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends JComponent {
    public Square(int frameWidth) {
        this.setBounds(0, 0, frameWidth, frameWidth);
    }

    public void paint(Graphics g) {
        Graphics2D  g2          = (Graphics2D) g;
        Rectangle2D rectangle2D = new Rectangle2D.Double(100, 100, 200, 200);
        g2.setColor(Color.BLUE);
        g2.fill(rectangle2D);
    }
}
