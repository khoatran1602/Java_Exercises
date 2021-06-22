package com.exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] data = new double[3];
        double[] anotherData = new double[3];
        System.out.println("Enter data for the first circle: ");
        for (int i = 0; i < 3; i++) {
            data[i] = input.nextDouble();
        }
        System.out.println("Enter data for the second circle: ");
        for (int i = 0; i < 3; i++) {
            anotherData[i] = input.nextDouble();
        }
        double checkDistance = Math.sqrt(((data[0] - anotherData[0]) * (data[0] - anotherData[0])) +
                ((data[1] - anotherData[1]) * (data[1] - anotherData[1])));
        double sumRadius = data[2] + anotherData[2];
        double minusRadius = data[2] - anotherData[2];
        if (checkDistance <= Math.abs(minusRadius) && data[2] > anotherData[2]) {
            System.out.println("Circle 2 is inside circle 1.");
        } else if (checkDistance <= sumRadius) {
            System.out.println("Circles overlaps to each other.");
        } else if (checkDistance <= Math.abs(minusRadius) && anotherData[2] > data[2]) {
            System.out.println("Circle 1 is inside circle 2.");
        } else {
            System.out.println("Circles is far away from each other");
        }
    }
}
