package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Rectangle {

    private int width;

    private int height;

    private static Map<String, Rectangle> rectangles = new HashMap<>();

    private Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static Rectangle getInstance(int width, int height) {
        String key = width + " " + height;
        Rectangle stored = rectangles.get(key);
        if (stored == null) {
            stored = new Rectangle(width, height);
            rectangles.put(key, stored);
        }
        return stored;
    }
}
