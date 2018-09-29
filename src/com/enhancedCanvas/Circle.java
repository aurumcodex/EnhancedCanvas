package com.enhancedCanvas;

class Circle extends Shape {

    /**
     * Creates a Circle object that merely stores the parameters passed to it.
     * @param x             the x-coordinate to start from.
     * @param y             the y-coordinate to start from.
     * @param radius        the distance to the line from the center point of the circle.
     */
    Circle(int x, int y, int radius) { super(x, y, radius, 0, false, true); }

}
