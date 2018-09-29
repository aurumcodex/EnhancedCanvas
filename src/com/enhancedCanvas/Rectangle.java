package com.enhancedCanvas;

class Rectangle extends Shape {

//    int x, y, x_width, y_width;

    /**
     * Creates a Rectangle object that merely stores the parameters passed to it.
     * @param x             the x-coordinate to start from.
     * @param y             the y-coordinate to start from.
     * @param x_width       how wide the rectangle is to be.
     * @param y_width       how tall the rectangle is to be.
     */
    Rectangle(int x, int y, int x_width, int y_width ) { super(x, y, x_width, y_width, false, true); }// rectangle constructor for rectangles

}
