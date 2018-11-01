package utils;

import java.awt.*;

public class GraphicsHelper {

    public static Color getColor(String color) throws IllegalArgumentException {
        switch (color) {
            case "RED": {
                return Color.RED;
            }
            case "BLUE": {
                return Color.BLUE;
            }
            case "YELLOW": {
                return Color.YELLOW;
            }
            case "WHITE": {
                return Color.white;
            }
            case "GREEN": {
                return Color.green;
            }
            default: {
                throw new IllegalArgumentException("Color " + color + " is not currently supported.");
            }
        }
    }
}
