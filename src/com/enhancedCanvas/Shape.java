package com.enhancedCanvas;

class Shape {

    int x, y, length, height;
    boolean isLeft, isVisible;

    /**
     * The base constructor to store parameters in from the other shape classes.
     * All classes extending this class follow this template.
     * @param x             the x-coordinate to start from.
     * @param y             the y-coordinate to start from.
     * @param length        how long the shape is to be (used as Circle's radius).
     * @param height        how tall the shape is to be (unused in Circle, Diamond, Triangle, and InvertTriangle).
     * @param isLeft        a flag to determine if the shape is to be slanted to the left (Parallelogram only).
     * @param isVisible     a flag to determine if the shape is to be visible or not (default = true).
     */
    Shape(int x, int y, int length, int height, boolean isLeft, boolean isVisible) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.height = height;
        this.isLeft = isLeft;
        this.isVisible = isVisible;
    }


}
