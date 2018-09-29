package com.enhancedCanvas;

class Parallelogram extends Shape {

    /**
     * Creates a Parallelogram object that merely stores the parameters passed to it.
     * @param x             the x-coordinate to start from.
     * @param y             the y-coordinate to start from.
     * @param length        how wide the parallelogram is to be.
     * @param height        how tall, and, conversely, how long the slants are to be.
     * @param isLeft        a flag to determine if the shape is to be drawn slanted left.
     */
    Parallelogram(int x, int y, int length, int height, boolean isLeft) {
        super(x, y, length, height, isLeft, true);
    }

}
