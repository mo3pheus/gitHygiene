package graphics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;

public class CircleGenerator {
    private JFrame     frame                 = null;
    private Properties applicationProperties = null;
    private Logger     logger                = LoggerFactory.getLogger(CircleGenerator.class);

    public CircleGenerator(Properties applicationProperties) {
        this.applicationProperties = applicationProperties;
        this.frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(new Rectangle(50, 50, 500, 500));
        frame.setVisible(true);
        frame.setTitle("Circle Generator");
    }

    public void drawCircle() {
        JLayeredPane contentPane = new JLayeredPane();
        contentPane.add(new Circle(400));
        frame.setContentPane(contentPane);
        frame.repaint();
        frame.setVisible(true);
        logger.info("Circle drawn!");
    }
}
