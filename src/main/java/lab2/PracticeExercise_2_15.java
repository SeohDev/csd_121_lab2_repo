package lab2;

import java.awt.*;

public class PracticeExercise_2_15 {

    public static void main(String[] args) {
        // Construct the two points with coordinates (3, 4) and (-3, -4)
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-3, -4);

        // Calculate the distance between the two points using the distance method
        double distance = p1.distance(p2);

        // Print the distance and the expected distance
        System.out.println("Distance: " + distance);
        System.out.println("Expected distance: " + p1.distance(0, 0) + p2.distance(0, 0));
    }
}