package structural.bridge.drawing;

import structural.bridge.coloring.ColoringSystem;

public class DrawingSquare extends DrawingSystem {
    public DrawingSquare(ColoringSystem coloringSystem) {
        super(coloringSystem);
    }

    @Override
    protected void drawShape() {
        System.out.print(" SQUARE ");
    }
}
