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
                String newWords = words.replaceAll("[^a-zA-Z]", "");
                System.out.println(newWords);
                if (newWords.equalsIgnoreCase(swap.swapChar(words))) {
                    System.out.println(words + " is a palindrome.");
                } else {
                    System.out.println(words + " is not a palindrome.");
                }
                break;
            } else {
                System.out.printf("Please enter your words: ");
            }
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//swap.java
package com.exercises;

public class Swap {
    public String swapChar(String words) {
        String newWords = words.replaceAll("[^a-zA-Z]", "");
        System.out.println(newWords);
        char word[] = newWords.toCharArray();
        char swapWords[] = new char[newWords.length()];
        int count = newWords.length() - 1;
        for (int i = 0; i < newWords.length(); i++) {
            swapWords[count] = word[i];
            count--;
        }
        System.out.println(swapWords);
        return new String(swapWords);
    }
}
