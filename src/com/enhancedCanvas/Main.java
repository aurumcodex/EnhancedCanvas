/*
 Author: Nathan Adams
 Project Name: EnhancedCanvas
 Version: 2.1.0
 Assistance From: Brian Rumsey (for project re-organization tips using his source as a template; the code is not,
                                however, a direct copy of his, it is just similarly structured.)

 NOTE: The display window *will* have to be resized to view all of the flowchart.

 CHANGELOG:
 > 1.0.0 - initial release; boxes, triangles and lines only, BW only.
 > 2.0.0 - revised code base to separate all different shapes, added color support.
 > 2.0.1 - reorganization of code base to simplify creating new shapes and adding more shape types in the future.
 > 2.1.0 - addition of Trapezoids and InvertTrapezoids, along with extra mouse functionality.
 */

package com.enhancedCanvas;

import csci338.drawings.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Main extends SimpleDrawing {
    private static ArrayList<Shape> shapes = new ArrayList<>();
    private static Main  main              = new Main();
    private static Color default_fore      = new Color(158, 255, 255);
    private static Color default_back      = new Color( 17,  29,  19);
    private static Color alt_back          = new Color( 37,  49,  39);
    private static Color cloud_grey        = new Color(200, 200, 200);
    private static Color cinnabar          = new Color(227,  66,  52);
    private static Color fire_orange       = new Color(230, 115,   0);
    private static Color goldenrod         = new Color(218, 165,  32);
    private static Color chartreuse        = new Color(161, 194,   0);
    private static Color xanadu            = new Color(112, 151, 117);
    private static Color verdigris         = new Color( 86, 171, 183);
    private static Color cerulean          = new Color(  0, 123, 167);
    private static Color violet            = new Color(123,   1, 167);

    public static void main(String[] args) {

        main.setForegroundColor(default_fore);
        main.setBackgroundColor(default_back);

        Rectangle rectangle = new Rectangle(800, 25, 200, 100);
        main.createRectangle(rectangle);
        shapes.add(rectangle);

        main.horizontal(500, 175, 800);
        main.drawArrow(900, 175, 50, false, true, false);
        main.drawArrow(500, 175, 50, false, false, true);
        main.drawArrow(900, 175, 50, false, false, true);
        main.drawArrow(1300, 175, 50, false, false, true);

        Diamond left_dia = new Diamond(500, 265, 45);
        main.createDiamond(left_dia);
        shapes.add(left_dia);
        Diamond center_dia = new Diamond(900, 265, 45);
        main.createDiamond(center_dia);
        shapes.add(center_dia);
        Diamond right_dia = new Diamond(1300, 265, 45);
        main.createDiamond(right_dia);
        shapes.add(right_dia);

        main.dashedLine(500, 310, 50, true);
        main.dashedLine(400, 360, 200, false);
        main.dashedLine(400, 360, 50, true);
        main.dashedLine(600, 360, 50, true);

        main.dashedLine(900, 310, 50, true);
        main.dashedLine(800, 360, 200, false);
        main.dashedLine(800, 360, 50, true);
        main.dashedLine(1000, 360, 50, true);

        main.dashedLine(1300, 310, 50, true);
        main.dashedLine(1200, 360, 200, false);
        main.dashedLine(1200, 360, 50, true);
        main.dashedLine(1400, 360, 50, true);

        Circle left_good = new Circle(400, 450, 50);
        main.createCircle(left_good);
        shapes.add(left_good);
        Circle left_bad = new Circle(600, 450, 50);
        main.createCircle(left_bad);
        shapes.add(left_bad);
        Circle mid_good = new Circle(800, 450, 50);
        main.createCircle(mid_good);
        shapes.add(mid_good);
        Circle mid_bad = new Circle(1000, 450, 50);
        main.createCircle(mid_bad);
        shapes.add(mid_bad);
        Circle right_good = new Circle(1200, 450, 50);
        main.createCircle(right_good);
        shapes.add(right_good);
        Circle right_bad = new Circle(1400, 450, 50);
        main.createCircle(right_bad);
        shapes.add(right_bad);

        main.dottedLine(400, 500, 50, true);
        main.dottedLine(600, 500, 50, true);
        main.dottedLine(800, 500, 50, true);
        main.dottedLine(1000, 500, 50, true);
        main.dottedLine(1200, 500, 50, true);
        main.dottedLine(1400, 500, 50, true);

        Triangle left_tri_good = new Triangle(400, 600, 50);
        main.createTriangle(left_tri_good);
        shapes.add(left_tri_good);
        InvertTriangle left_tri_bad = new InvertTriangle(600, 600, 50);
        main.createInvertedTriangle(left_tri_bad);
        shapes.add(left_tri_bad);

        Triangle mid_tri_good = new Triangle(800, 600, 50);
        main.createTriangle(mid_tri_good);
        shapes.add(mid_tri_good);
        InvertTriangle mid_tri_bad = new InvertTriangle(1000, 600, 50);
        main.createInvertedTriangle(mid_tri_bad);
        shapes.add(mid_tri_bad);

        Triangle right_tri_good = new Triangle(1200, 600, 50);
        main.createTriangle(right_tri_good);
        shapes.add(right_tri_good);
        InvertTriangle right_tri_bad = new InvertTriangle(1400, 600, 50);
        main.createInvertedTriangle(right_tri_bad);
        shapes.add(right_tri_bad);

        main.upLeft_Diag(450, 650, 50);
        main.upLeft_Diag(850, 650, 50);
        main.upLeft_Diag(1250, 650, 50);

        Parallelogram left_para = new Parallelogram(425, 675, 200, 50, false);
        main.createParallelogram(left_para);
        shapes.add(left_para);
        Parallelogram mid_para = new Parallelogram(875, 675, 200, 50, true);
        main.createParallelogram(mid_para);
        shapes.add(mid_para);
        Parallelogram right_para = new Parallelogram(1225, 675, 200, 50, false);
        main.createParallelogram(right_para);
        shapes.add(right_para);

        Trapezoid trapezoid = new Trapezoid(100, 250, 200, 75);
        main.createTrapezoid(trapezoid);
        shapes.add(trapezoid);

        InvertTrapezoid inv_trapezoid = new InvertTrapezoid(1500, 200, 200, 50);
        main.createInvertedTrapezoid(inv_trapezoid);
        shapes.add(inv_trapezoid);

    }// end main function

    // ------------------------LINES--------------------------

    /**
     * Creates a simple horizontal line.
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     */
    private void horizontal(int x, int y, int length) {
        int i = 0;
        while (i <= length) {
            showPoint(x + i, y);
            i++;
        }
    }// show horizontal lines

    /**
     * Creates a horizontal line that instead hides the line (a sort of "anti-line")
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     */
    private void anti_horizontal(int x, int y, int length) {
        int i = 0;
        while (i <= length) {
            hidePoint(x + i, y);
            i++;
        }
    }// hide horizontal lines

    /**
     * Creates a simple vertical line.
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     */
    private void vertical(int x, int y, int length) {
        int j = 0;
        while (j <= length) {
            showPoint(x, y + j);
            j++;
        }
    }// vertical lines

    /**
     * Creates a vertical line that instead hides the line (a sort of "anti-line")
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     */
    private void anti_vertical(int x, int y, int length) {
        int j = 0;
        while (j <= length) {
            hidePoint(x, y + j);
            j++;
        }
    }// hide vertical lines

    /**
     * Creates a diagonal line that is drawn from the origin point up and to the left.
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     */
    private void upLeft_Diag(int x, int y, int length) {
        for (int i = length; i >= 0; i--) {
            showPoint(x - i, y - i);
        }
    }// up-left diagonals

    /**
     * Creates a diagonal line that is drawn to hide the line(s) under it from the origin point up and to the left.
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     */
    private void anti_upLeft_Diag(int x, int y, int length) {
        for (int i = length; i >= 0; i--) {
            hidePoint(x - i, y - i);
        }
    }// up-left diagonals

    /**
     * Creates a diagonal line that is drawn from the origin point up and to the right.
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     */
    private void upRight_Diag(int x, int y, int length) {
        for (int i = length; i >= 0; i--) {
            showPoint(x + i, y - i);
        }
    }// up-right diagonals

    /**
     * Creates a diagonal line that is drawn to hide the line(s) under it from the origin point up and to the right.
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     */
    private void anti_upRight_Diag(int x, int y, int length) {
        for (int i = length; i >= 0; i--) {
            hidePoint(x + i, y - i);
        }
    }// up-right diagonals

    /**
     * Creates a dotted line that is either horizontal or vertical from the origin point and for a certain length.
     * NOTE: This only draws in the two standard states of lines: horizontal (default behavior) and vertical.
     * @param x             the x coordinate to originate the line from.
     * @param y             the y coordinate to originate the line from.
     * @param length        the length of the line to be drawn.
     * @param isVertical    a flag to determine if the line is to be drawn vertically.
     */
    private void dottedLine(int x, int y, int length, boolean isVertical) {
        if (!isVertical) {
            for (int i = 0; i < length; i += 3) {
                showPoint(x + i, y);
            }
        } else {
            for (int j = 0; j < length; j += 3) {
                showPoint(x, y + j);
            }
        }
    }// dotted line

    /**
     * Creates a dashed line that is either horizontal or vertical from the origin point and for a certain length.
     * NOTE: This only draws in the two standard states of lines: horizontal (default behavior) and vertical.
     * @param x             the x coordinate to originate the line from.
     * @param y             the y coordinate to originate the line from.
     * @param length        the length of the line to be drawn.
     * @param isVertical    a flag to determine if the line is to be drawn vertically.
     */
    private void dashedLine(int x, int y, int length, boolean isVertical) {
        if (!isVertical) {
            for (int i = 0; i < length; i += 10) {
                for (int j = 0; j < 5; j++) {
                    showPoint(x+i+j, y);
                }
            }
        } else {
            for (int i = 0; i < length; i += 10) {
                for (int j = 0; j < 5; j++) {
                    showPoint(x, y+i+j);
                }
            }
        }
    }// dashed line

    /**
     * Creates an arrow at the given origin point and for a certain length.
     * NOTE: This only draws in the four cardinal directions: Up, Down, Left, and Right (default behavior).
     * @param x         the x coordinate to originate the line from.
     * @param y         the y coordinate to originate the line from.
     * @param length    the length of the line to be drawn.
     * @param isLeft    a flag to determine if the arrow is pointing left.
     * @param isUp      a flag to determine if the arrow is pointing up.
     * @param isDown    a flag to determine if the arrow is pointing down.
     */
    private void drawArrow(int x, int y, int length, boolean isLeft, boolean isUp, boolean isDown) {
        int arrow_wing_length = 12;
        if (isLeft) {
            horizontal(x-length, y, length);
            upLeft_Diag(x-length+arrow_wing_length, y+arrow_wing_length, arrow_wing_length);
            upRight_Diag(x-length, y, arrow_wing_length);
        }
        else if (isUp) {
            vertical(x, y-length, length);
            upLeft_Diag(x+arrow_wing_length, y-length+arrow_wing_length, arrow_wing_length);
            upRight_Diag(x-arrow_wing_length, y-length+arrow_wing_length, arrow_wing_length);
        }
        else if (isDown) {
            vertical(x, y, length);
            upLeft_Diag(x, y+length, arrow_wing_length);
            upRight_Diag(x, y+length, arrow_wing_length);
        }
        else {
            horizontal(x, y, length);
            upLeft_Diag(x+length, y, arrow_wing_length);
            upRight_Diag(x+length-arrow_wing_length, y+arrow_wing_length, arrow_wing_length);
        }
    }// arrows


    // ----------------------SHAPES------------------------

    /**
     * Takes the parameters from a Rectangle object and turns it into a displayed shape.
     * @param rect      The source parameters of a Rectangle object.
     */
    private void createRectangle(Rectangle rect) {
        int x       = rect.x;
        int y       = rect.y;
        int length  = rect.length;
        int height  = rect.height;

        if (rect.isVisible) {
            horizontal(x, y, length);
            vertical(x, y, height);
            horizontal(x, y + height, length);
            vertical(x + length, y, height);
        }
        else if (!rect.isVisible) {
            anti_horizontal(x, y, length);
            anti_vertical(x, y, height);
            anti_horizontal(x, y + height, length);
            anti_vertical(x + length, y, height);
        }
    }// create rectangle

    /**
     * Takes the parameters from a Circle object and turns it into a displayed shape.
     * @param circle    The source parameters of a Circle object
     */
    private void createCircle(Circle circle) {
        int x       = circle.x;
        int y       = circle.y;
        int radius  = circle.length;
        double x0;
        double y0;

        if (circle.isVisible) {
            for (double theta = 0; theta <= 2 * Math.PI; theta += 0.001) {
                x0 = x + radius * Math.cos(theta);
                y0 = y + radius * Math.sin(theta);
                showPoint((int) x0, (int) y0);
            }
        }
        else if (!circle.isVisible) {
            for (double theta = 0; theta <= 2 * Math.PI; theta += 0.001) {
                x0 = x + radius * Math.cos(theta);
                y0 = y + radius * Math.sin(theta);
                hidePoint((int) x0, (int) y0);
            }
        }
    }// create circle

    /**
     * Takes the parameters from a Parallelogram object and turns it into a displayed shape.
     * @param parallelogram     The source parameters of a Parallelogram object.
     */
    private void createParallelogram(Parallelogram parallelogram) {
        int x           = parallelogram.x;
        int y           = parallelogram.y;
        int length      = parallelogram.length;
        int height      = parallelogram.height;
        boolean isLeft  = parallelogram.isLeft;

        if (parallelogram.isVisible) {
            if (!isLeft) {
                horizontal(x, y, length);
                upRight_Diag(x, y, height);
                horizontal(x + height, y - height, length);
                upRight_Diag(x + length, y, height);
            } else {
                horizontal(x, y, length);
                upLeft_Diag(x, y, height);
                horizontal(x - height, y - height, length);
                upLeft_Diag(x + length, y, height);
            }// !isLeft || isLeft
        }// isVisible
        else if (!parallelogram.isVisible) {
            if (!isLeft) {
                anti_horizontal(x, y, length);
                anti_upRight_Diag(x, y, height);
                anti_horizontal(x + height, y - height, length);
                anti_upRight_Diag(x + length, y, height);
            } else {
                anti_horizontal(x, y, length);
                anti_upLeft_Diag(x, y, height);
                anti_horizontal(x - height, y - height, length);
                anti_upLeft_Diag(x + length, y, height);
            }// !isLeft || isLeft
        }// !isVisible
    }// create parallelogram

    /**
     * Takes the parameters from a Diamond object and turns it into a displayed shape.
     * @param diamond   The source parameters of a Diamond object.
     */
    private void createDiamond(Diamond diamond) {
        int x       = diamond.x;
        int y       = diamond.y;
        int length  = diamond.length;

        if (diamond.isVisible) {
            upLeft_Diag(x + length, y, length);
            upRight_Diag(x - length, y, length);
            upLeft_Diag(x, y + length, length);
            upRight_Diag(x, y + length, length);
        }
        else if (!diamond.isVisible) {
            anti_upLeft_Diag(x + length, y, length);
            anti_upRight_Diag(x - length, y, length);
            anti_upLeft_Diag(x, y + length, length);
            anti_upRight_Diag(x, y + length, length);
        }
    }// create diamond

    /**
     * Takes the parameters from a Triangle object and turns it into a displayed shape.
     * @param triangle  The source parameters of a normal Triangle object.
     */
    private void createTriangle(Triangle triangle) {
        int x       = triangle.x;
        int y       = triangle.y;
        int length  = triangle.length;

        if (triangle.isVisible) {
            horizontal(x - length, y, length * 2);
            upLeft_Diag(x + length, y, length);
            upRight_Diag(x - length, y, length);
//            vertical(x, y-length, length);
        }
        else if (!triangle.isVisible) {
            anti_horizontal(x - length, y, length * 2);
            anti_upLeft_Diag(x + length, y, length);
            anti_upRight_Diag(x - length, y, length);
        }
    }// create a normal triangle

    /**
     * Takes the parameters from an InvertTriangle object and turns it into a displayed shape.
     * @param triangle  The source parameters of an InvertTriangle object.
     */
    private void createInvertedTriangle(InvertTriangle triangle) {
        int x = triangle.x;
        int y = triangle.y;
        int length = triangle.length;
        if (triangle.isVisible) {
            horizontal(x - length, y - length, length * 2);
            upLeft_Diag(x, y, length);
            upRight_Diag(x, y, length);
        }
        else if (!triangle.isVisible) {
            anti_horizontal(x - length, y - length, length * 2);
            anti_upLeft_Diag(x, y, length);
            anti_upRight_Diag(x, y, length);
        }
    }// creates an inverted triangle

    /**
     * Takes the parameters from a Trapezoid object and turns it into a displayed shape.
     * @param trapezoid The source parameters of a Trapezoid object.
     */
    private void createTrapezoid(Trapezoid trapezoid) {
        int x = trapezoid.x;
        int y = trapezoid.y;
        int base_length = trapezoid.length;
        int height = trapezoid.height;
        if (trapezoid.isVisible) {
            horizontal(x, y, base_length);
            upLeft_Diag(x+base_length, y, height);
            upRight_Diag(x, y, height);
            horizontal(x+height, y-height, base_length-(2*height));
        }
        else if (!trapezoid.isVisible) {
            anti_horizontal(x, y, base_length);
            anti_upLeft_Diag(x+base_length, y, height);
            anti_upRight_Diag(x, y, height);
            anti_horizontal(x+height, y-height, base_length-(2*height));
        }
    }// create regular trapezoid

    /**
     * Take the parameters from an InvertTrapezoid object and turns it into a displayed shape.
     * @param trapezoid The source parameters of an InvertTrapezoid object.
     */
    private void createInvertedTrapezoid(InvertTrapezoid trapezoid) {
        int x = trapezoid.x;
        int y = trapezoid.y;
        int base_length = trapezoid.length;
        int height = trapezoid.height;
        if (trapezoid.isVisible) {
            horizontal(x, y, base_length);
            upLeft_Diag(x+height, y+height, height);
            upRight_Diag(x+(base_length-height), y+height, height);
            horizontal(x+height, y+height, base_length-(2*height));
        }// isVisible
        else if (!trapezoid.isVisible) {
            anti_horizontal(x, y, base_length);
            anti_upLeft_Diag(x+height, y+height, height);
            anti_upRight_Diag(x+(base_length-height), y+height, height);
            anti_horizontal(x+height, y+height, base_length-(2*height));
        }// !isVisible
    }// crete inverted trapezoid


    /**
     * A function that when the mouse is clicked will remove or hide the shape that it is clicked on, assuming that it
     * was added to the ArrayList that is to contain all of the shapes.
     * @param e         the MouseEvent that is being listened to.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                if (x >= s.x && x<= s.x+s.length && y >= s.y && y <= s.y+s.height) {
                    Rectangle temp = (Rectangle) s;
                    temp.isVisible = false;
                    main.createRectangle(temp);
                    main.setForegroundColor(cinnabar);
//                    main.setBackgroundColor(alt_back);
                }
            }// instanceof Rectangle
            if (s instanceof Circle) {
                if (x >= s.x-s.length && x <= s.x+s.length && y >= s.y-s.length && y <= s.y+s.length) {
                    Circle temp = (Circle) s;
                    temp.isVisible = false;
                    main.createCircle(temp);
                    main.setForegroundColor(xanadu);
                }
            }// instanceof Circle
            if (s instanceof Diamond) {
                if (x >= s.x-s.length && x <= s.x+s.length && y >= s.y-s.length && y <= s.y+s.length) {
                    Diamond temp = (Diamond) s;
                    temp.isVisible = false;
                    main.createDiamond(temp);
                    main.setForegroundColor(cerulean);
                }
            }// instanceof Diamond
            if (s instanceof Parallelogram) {
                if (x >= s.x-s.length && x <= s.x+s.length && y <= s.y && y >= s.y-s.height) {
                    Parallelogram temp = (Parallelogram) s;
                    temp.isVisible = false;
                    main.createParallelogram(temp);
                    main.setForegroundColor(violet);
                }
            }// instanceof Parallelogram
            if (s instanceof Triangle) {
                if (x >= s.x-s.length && x <= s.x+s.length && y >= s.y-s.length && y <= s.y) {
                    Triangle temp = (Triangle) s;
                    temp.isVisible = false;
                    main.createTriangle(temp);
                    main.setForegroundColor(chartreuse);
                }
            }// instanceof Triangle
            if (s instanceof InvertTriangle) {
                if (x >= s.x-s.length && x <= s.x+s.length && y >= s.y-s.length && y <= s.y) {
                    InvertTriangle temp = (InvertTriangle) s;
                    temp.isVisible = false;
                    main.createInvertedTriangle(temp);
                    main.setForegroundColor(fire_orange);
                }
            }// instanceof InvertTriangle
            if (s instanceof Trapezoid) {
                if (x >= s.x && x <= s.x+s.length && y <= s.y && y >= s.y-s.height) {
                    Trapezoid temp = (Trapezoid) s;
                    temp.isVisible = false;
                    main.createTrapezoid(temp);
                    main.setForegroundColor(goldenrod);
                }
            }
            if (s instanceof InvertTrapezoid) {
                if (x >= s.x && x <= s.x+s.length && y >= s.y && y <= s.y+s.height) {
                    InvertTrapezoid temp = (InvertTrapezoid) s;
                    temp.isVisible = false;
                    main.createInvertedTrapezoid(temp);
                    main.setForegroundColor(verdigris);
                }
            }
        }//for loop
    }// mouseClick function

    /**
     * A mouse function that alters the flowchart display's colors.
     * @param e         the MouseEvent being listened to.
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        main.setForegroundColor(cloud_grey);
        main.setBackgroundColor(alt_back);
    }// mouseEntered function

    /**
     * A mouse function that reverts the flowchart display's colors.
     * @param e         the MouseEvent being listened to.
     */
    @Override
    public void mouseExited(MouseEvent e) {
        main.setForegroundColor(default_fore);
        main.setBackgroundColor(default_back);
    }// mouseExited function

}
