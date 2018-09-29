package com.enhancedCanvas;

class InvertTriangle extends Shape {

    /**
     * Creates an InvertedTriangle object that merely stores the parameters passed to it.
     * @param x             the x-coordinate to start from.
     * @param y             the y-coordinate to start from.
     * @param length        how long the sides are to be (base is doubled).
     */
    InvertTriangle(int x, int y, int length) {
        super(x, y, length, 0, false, true);
    }
}
