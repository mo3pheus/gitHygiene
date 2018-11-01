package graphics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.GraphicsHelper;

import java.awt.*;

public class ComponentFactory {
    private Logger logger = LoggerFactory.getLogger(ComponentFactory.class);

    public Component getComponent(String componentName, String color) throws IllegalArgumentException {
        Color componentColor = Color.BLACK;
        try {
            componentColor = GraphicsHelper.getColor(color);
        } catch (IllegalArgumentException iae) {
            logger.error("Using default color.", iae);
        }

        switch (componentName) {
            case "SQUARE": {
                return new Square(componentColor);
            }
            case "CIRCLE": {
                return new Circle(componentColor);
            }
            default: {
                throw new IllegalArgumentException("Incorrect arguments passed.");
            }
        }
    }
}
