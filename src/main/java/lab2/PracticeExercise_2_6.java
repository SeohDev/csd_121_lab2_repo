package lab2;

import java.awt.*;
public class PracticeExercise_2_6 {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0,0);
        System.out.println("Expected location: 5, 10");
        System.out.println("Actual location: " + box.getX() + ", " + box.getY());
        System.out.println("Expected dimensions: 20, 30");
        System.out.println("Actual dimensions: " + box.getWidth() + ", " + box.getHeight());
    }
}
