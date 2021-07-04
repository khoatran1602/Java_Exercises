package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        HashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(numbers[i]);
        }
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.printf("%2d", iterator.next());
//        }
        System.out.println(set);
    }
}
