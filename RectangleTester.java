/*
 Charles Chen
 9/23/21
 Calculates and prints out a rectangles area and perimeter and the rectangles dimensions
 */

import java.awt.Rectangle;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0, 0, 5, 5);
        double area = rectangle.getWidth() * rectangle.getHeight();
        double perimeter = rectangle.getHeight() * 2 + rectangle.getWidth() * 2;
        System.out.println("Height = " + rectangle.getHeight() + " ft, Width = " + rectangle.getWidth()
                + " ft, Area = " + area + " ft, Perimeter = " + perimeter);
    }
}
