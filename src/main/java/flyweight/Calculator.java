package flyweight;

import java.util.List;

public class Calculator {

    public int calculateDistances(List<Rectangle> rectangles, int distance) {
        if (rectangles == null || rectangles.size() <= 1) {
            return 0;
        }
        int sum = rectangles.stream()
                .mapToInt(r -> r.getWidth())
                .sum();
        if (sum > distance) {
            throw new IllegalArgumentException("Not fit");
        }
        int result = (distance - sum) / (rectangles.size() - 1);
        return result;
    }
}
