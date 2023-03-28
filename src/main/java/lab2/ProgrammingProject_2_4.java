package lab2;

import javax.swing.*;
import java.awt.*;

public class ProgrammingProject_2_4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Intersection Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        IntersectionDrawer component = new IntersectionDrawer();
        frame.add(component);

        frame.setVisible(true);
    }

    private static class IntersectionDrawer extends JComponent {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;


            g2.setColor(Color.RED);
            Rectangle rect1 = new Rectangle(100, 100, 150, 100);
            g2.draw(rect1);


            g2.setColor(Color.BLUE);
            Rectangle rect2 = new Rectangle(170, 20, 100, 150);
            g2.draw(rect2);


            g2.setColor(Color.YELLOW);
            Rectangle intersection = rect1.intersection(rect2);
            g2.draw(intersection);
        }
    }
}