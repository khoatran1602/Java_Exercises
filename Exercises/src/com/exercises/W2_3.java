//Main.java
package com.exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Swap swap = new Swap();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your words: ");
        while (true) {
            String words = input.nextLine();
            if (!words.isEmpty()) {
                swap.swapChar(words);
                break;
            } else {
                System.out.printf("Please enter your words: ");
            }
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
  //Swap.java
package com.exercises;

public class Swap {
    public void swapChar(String words) {
        char word[] = words.toCharArray();
        for (int j = words.length() - 1; j >= 0; j--) {
            System.out.printf(String.valueOf(word[j]));
        }
    }
}
