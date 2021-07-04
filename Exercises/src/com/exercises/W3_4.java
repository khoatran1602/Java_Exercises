Main class
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter first rectangle data: ");
        double height = input.nextDouble();
        double width = input.nextDouble();
        System.out.print("Enter second rectangle data: ");
        double height2 = input.nextDouble();
        double width2 = input.nextDouble();
        Rectangle rec1 = new Rectangle(height, width);
        Rectangle rec2 = new Rectangle(height2, width2);
        Rectangle[] rectangle = {rec1, rec2};
        for (int  i = 0; i < rectangle.length; i++) {
            System.out.print("The rectangle's height, width, area and perimeter: ");
            System.out.println(rectangle[i].getHeight() + " " + rectangle[i].getWidth() + " " +
                    rectangle[i].getArea() + " " + rectangle[i].getPerimeter());
        }
    }
}
-----------------------------------------------------------------------------------------------------
  Rectangle class
    package com.company;

public class Rectangle {
    private double height;

    private double width;
    public Rectangle() {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double newHeight, double newWidth) {
        this.height = newHeight;
        this.width = newWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height * 2 + width * 2);
    }
}
