package structural.bridge.drawing;

import structural.bridge.coloring.ColoringSystem;

public class DrawingCircle extends DrawingSystem {
    public DrawingCircle(ColoringSystem coloringSystem) {
        super(coloringSystem);
    }

    @Override
    protected void drawShape() {
        System.out.print(" CIRCLE ");
    }
}
