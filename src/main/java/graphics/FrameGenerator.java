package graphics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class FrameGenerator {
    private JFrame           frame              = null;
    private Properties       graphicsProperties = null;
    private Logger           logger             = LoggerFactory.getLogger(FrameGenerator.class);
    private List<String>     components         = new ArrayList<>();
    private int              frameX             = 0;
    private int              frameY             = 0;
    private int              frameWidth         = 0;
    private int              frameHeight        = 0;
    private String           frameTitle         = null;
    private ComponentFactory componentFactory   = null;

    public FrameGenerator(Properties graphicsProperties) {
        this.graphicsProperties = graphicsProperties;
        this.frame = new JFrame();

        this.frameHeight = Integer.parseInt(graphicsProperties.getProperty("frame.height"));
        this.frameWidth = Integer.parseInt(graphicsProperties.getProperty("frame.width"));
        this.frameX = Integer.parseInt(graphicsProperties.getProperty("frame.X"));
        this.frameY = Integer.parseInt(graphicsProperties.getProperty("frame.Y"));
        this.frameTitle = graphicsProperties.getProperty("frame.title");

        components.addAll(Arrays.asList(graphicsProperties.getProperty("frame.components").split(",")));

        this.componentFactory = new ComponentFactory();

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(new Rectangle(frameX, frameY, frameWidth, frameHeight));
        frame.setVisible(true);
        frame.setTitle(frameTitle);
    }

    public void drawComponents() {
        List<Component> graphicComponents = new ArrayList<>();
        for (String componentDetails : components) {
            String componentName  = componentDetails.split("-")[0];
            String componentColor = componentDetails.split("-")[1];
            graphicComponents.add(componentFactory.getComponent(componentName, componentColor));
            logger.debug("Component " + componentName + " added in " + componentColor + " color");
        }

        JLayeredPane contentPane = new JLayeredPane();
        for (Component component : graphicComponents) {
            contentPane.add(component);
        }

        frame.setContentPane(contentPane);
        frame.repaint();
        frame.setVisible(true);
    }
}
