package com.enhancedCanvas;

class Diamond extends Shape {

//    int x, y, length;

    /**
     * Creates a Diamond object that merely stores the parameters passed to it.
     * @param x             the x-coordinate to start from.
     * @param y             the y-coordinate to start from.
     * @param length        how long all sides are to be on the diamond.
     */
    Diamond(int x, int y, int length) { super(x, y, length, 0, false, true); }

}
