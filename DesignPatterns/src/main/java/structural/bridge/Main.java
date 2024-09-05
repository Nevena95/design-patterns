package structural.bridge;

import structural.bridge.coloring.ColorBlue;
import structural.bridge.coloring.ColorGreen;
import structural.bridge.drawing.DrawingCircle;
import structural.bridge.drawing.DrawingSquare;
import structural.bridge.drawing.DrawingSystem;

/**
 *  USAGE:
 *  When we want to separately develop two systems and one system use another.
 *  By this principle, we avoid having many classes (BlueCircle, BlueSquare...).
 */

public class Main {

    public static void main(String[] args) {
        DrawingSystem circle = new DrawingCircle(new ColorBlue());
        DrawingSystem square = new DrawingSquare(new ColorGreen());

        circle.draw();
        System.out.print("\n");
        square.draw();
    }
}
