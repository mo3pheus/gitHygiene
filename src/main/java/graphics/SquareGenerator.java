package graphics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;

public class SquareGenerator {
    private JFrame     frame              = null;
    private Properties graphicsProperties = null;
    private Logger     logger             = LoggerFactory.getLogger(SquareGenerator.class);

    public SquareGenerator(Properties graphicsProperties) {
        this.graphicsProperties = graphicsProperties;
        this.frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(new Rectangle(50, 50, 500, 500));
        frame.setVisible(true);
        frame.setTitle("Square Generator");
    }

    public void drawSquare() {
        JLayeredPane contentPane = new JLayeredPane();
        Square square = new Square(200);
        square.setVisible(true);
        contentPane.add(square);
        frame.setContentPane(contentPane);
        frame.repaint();
        frame.setVisible(true);
        logger.debug("Square drawn");
    }
}
