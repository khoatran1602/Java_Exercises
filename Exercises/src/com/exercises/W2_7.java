Main class
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of scores: ");
        int length = input.nextInt();
        System.out.print("Enter scores: ");
        int[] scores = new int[length];
        for (int i = 0; i < length; i++) {
            scores[i] = input.nextInt();
        }
        Method method = new Method();
        method.findAverage(length, scores);
        method.checkScores(scores);
    }
}
---------------------------------------------------------
Method class
package com.company;

public class Method {
    private double average = 0;
    public double findAverage(int length, int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        average = sum / length;
        return average;
    }

    public void checkScores(int[] scores) {
        int above = 0;
        int below = 0;
        for (int score : scores) {
            if (score >= average) {
                above++;
            } else {
                below++;
            }
        }
        System.out.println("There are " + above + " scores above or equal average");
        System.out.println("There are " + below + " scores below average");
    }
}
