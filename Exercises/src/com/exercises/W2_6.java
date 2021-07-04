package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
            if (!map.containsKey(randomNum)) {
                map.put(randomNum, 1);
            } else {
                map.put(randomNum, map.get(randomNum) + 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time" + ((int)entry.getValue() > 1 ? "s" : ""));
        }
    }
}
