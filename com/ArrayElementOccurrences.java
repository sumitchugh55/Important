package com;

import java.util.HashMap;

public class ArrayElementOccurrences {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1, 3, 4, 5, 4 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}