package com.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Check check = new Check();
        String[] cities = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first city: ");
        cities[0] = input.nextLine();
        System.out.printf("Enter the second city: ");
        cities[1] = input.nextLine();
        System.out.printf("Enter the third city: ");
        cities[2] = input.nextLine();
        Arrays.sort(cities);
        System.out.println("The three cities in alphabetical order are " + cities[0] + " " + cities[1] + " " + cities[2]);
    }
}
