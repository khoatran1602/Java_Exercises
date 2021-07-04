//Main.java
package com.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Check check = new Check();
        System.out.printf("Enter your numbers: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        String[] lines = line.trim().split("\\s+");
        check.countOccurrences(lines);
    }
}
-----------------------------------------------------------------------------------------
 //Check.java
  package com.exercises;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Check {

    public void countOccurrences(String[] lines) throws IOException {
        Map<Integer, Integer> listOfNumbers = new HashMap<Integer, Integer>();
        int[] numbers = new int[lines.length];
        int count = 0;
        for (int i = 0; i < lines.length; i++) {
            numbers[i] = Integer.parseInt(lines[i]);
        }
        for (int i = 0; i < lines.length; i++) {
            if (listOfNumbers.get(numbers[i]) == null) {
                listOfNumbers.put(numbers[i], 1);
            } else {
                count = listOfNumbers.get(numbers[i]);
                count++;
                listOfNumbers.put(numbers[i], count);
            }
        }
        for (Integer number : listOfNumbers.keySet()) {
            if (listOfNumbers.get(number) == 1) {
                System.out.println(number + " occurs " + listOfNumbers.get(number) + " time.");
            } else {
                System.out.println(number + " occurs " + listOfNumbers.get(number) + " times.");
            }
        }
    }
}
