package lab2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class PracticeExercise_2_21 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Print my Name");


        NameComponent component = new NameComponent();
        frame.add(component);

        frame.setVisible(true);
    }

    private static class NameComponent extends JComponent {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;  // Cast the Graphics parameter into a Graphics2D object

            // Draw blue rectangle
            g2.setColor(Color.BLUE);
            Rectangle rect = new Rectangle(100, 100, 200, 50);
            g2.fill(rect);

            // Draw red name
            g2.setColor(Color.RED);
            Font font = new Font("Arial", Font.BOLD, 30);
            g2.setFont(font);
            g2.drawString("Liam", 130, 140);
        }
    }
}