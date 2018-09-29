package com.enhancedCanvas;

class Trapezoid extends Shape {

    /**
     * Creates a Trapezoid object that merely stores the parameters passed to it.
     * @param x             the x-coordinate to start from.
     * @param y             the y-coordinate to start from.
     * @param base_length   how wide the base of the trapezoid is to be.
     * @param height        how tall the trapezoid is to be from the base.
     */
    Trapezoid(int x, int y, int base_length, int height) { super(x, y, base_length, height, false, true); }

}
