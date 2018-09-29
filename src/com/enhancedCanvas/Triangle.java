package com.enhancedCanvas;

class Triangle extends Shape {

//    int x, y, length;
//    boolean isVisible;

    /**
     * Creates a Triangle object that merely stores the parameters passed to it.
     * @param x             the x-coordinate to start from.
     * @param y             the y-coordinate to start from.
     * @param length        how long the sides are to be (base is doubled).
     */
    Triangle(int x, int y, int length) {
        super(x, y, length, 0, false, true);
    }

}
