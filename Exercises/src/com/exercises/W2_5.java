package com.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++)
        {
            numbers[i] = input.nextInt();
        }
        int[] newNumbers = numbers.clone();
        boolean check = false;
        Arrays.sort(newNumbers);
        for (int i = 0; i < size; i++) {
            if (numbers[i] == newNumbers[i]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("The list is already sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }
    }
}
