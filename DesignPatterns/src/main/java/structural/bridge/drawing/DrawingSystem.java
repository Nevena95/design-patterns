package structural.bridge.drawing;

import structural.bridge.coloring.ColoringSystem;

public abstract class DrawingSystem {

    private final ColoringSystem coloringSystem;

    protected DrawingSystem(ColoringSystem coloringSystem) {
        this.coloringSystem = coloringSystem;
    }

    public void draw() {
        drawShape();
        coloringSystem.color();
    }

    protected abstract void drawShape();
}
