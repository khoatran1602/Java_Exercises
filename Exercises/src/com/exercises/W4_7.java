Main class
  
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double firstRealNum = input.nextDouble();
        double firstImgNum = input.nextDouble();
        System.out.print("Enter the second complex number: ");
        double secondRealNum = input.nextDouble();
        double secondImgNum = input.nextDouble();
        Complex complex = new Complex(firstRealNum, firstImgNum);
        Complex anotherComplex = new Complex(secondRealNum, secondImgNum);
        complex.add(anotherComplex);
        complex.substract(anotherComplex);
        complex.multiply(anotherComplex);
        complex.divide(anotherComplex);
        System.out.println("|(" + complex.getRealNum() + " + " + complex.getImgNum() + "i)| = " + complex.absoluteValue());
    }
}
-----------------------------------------------------------------------------------
Complex class
  
package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Complex implements Cloneable {
    private double realNum;
    private double imgNum;

    NumberFormat numberFormat = new DecimalFormat("#0.00");
    NumberFormat formatter = new DecimalFormat("#0.0000");

    public Complex() {
        this.realNum = 0;
        this.imgNum = 0;
    }

    public Complex(double newRealNum, double newImgNum) {
        this.realNum = newRealNum;
        this.imgNum = newImgNum;
    }

    public double getRealNum() {
        return realNum;
    }

    public double getImgNum() {
        return imgNum;
    }

    public void add(Complex secondComplex) {
        double realSum = realNum + secondComplex.realNum;
        double imgSum = imgNum + secondComplex.imgNum;
        System.out.println("(" + realNum + " * " + imgNum + "i)"
                + " * "  + "(" + secondComplex.realNum + " * " + secondComplex.imgNum + "i) = "
                + realSum + " + " + imgSum + "i");
    }

    public void substract(Complex secondComplex) {
        double realSub = realNum - secondComplex.realNum;
        double imgSub = imgNum - secondComplex.imgNum;
        System.out.println("(" + realNum + " * " + imgNum + "i)"
                + " * "  + "(" + secondComplex.realNum + " * " + secondComplex.imgNum + "i) = "
                + realSub + " - " + imgSub + "i");
    }

    public void multiply(Complex secondComplex) {
        double realMultiply = realNum * secondComplex.realNum - imgNum * secondComplex.imgNum;
        double imgMultiply = imgNum * secondComplex.realNum + realNum * secondComplex.imgNum;
        System.out.println("(" + realNum + " * " + imgNum + "i)"
                + " * "  + "(" + secondComplex.realNum + " * " + secondComplex.imgNum + "i) = "
                + numberFormat.format(realMultiply) + " + " + numberFormat.format(imgMultiply) + "i");
    }

    public void divide(Complex secondComplex) {
        double realDivision = (realNum * secondComplex.realNum + imgNum * secondComplex.imgNum)
                / (Math.pow(secondComplex.realNum,2) + Math.pow(secondComplex.imgNum,2));
        double imgDivision = (imgNum * secondComplex.realNum - realNum * secondComplex.imgNum)
                / (Math.pow(secondComplex.realNum,2) + Math.pow(secondComplex.imgNum,2));
        System.out.println("(" + realNum + " * " + imgNum + "i)"
                + " * "  + "(" + secondComplex.realNum + " * " + secondComplex.imgNum + "i) = "
                + formatter.format(realDivision) + " + " + numberFormat.format(imgDivision) + "i");
    }


    public double absoluteValue() {
        double absValue = Math.sqrt(Math.pow(getRealNum(), 2) + Math.pow(getImgNum(), 2));
        return absValue;
    }
}
