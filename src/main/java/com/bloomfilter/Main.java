package com.bloomfilter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cat", "word", "dog", "monkey", "human", "dog", "human", "ghost", "cat");

        int[] map = new int[1000];
        for (String word : words) {
            int hash1 = HashClass.generateHash1(word, map.length);
            int hash2 = HashClass.generateHash1(word, map.length);
            int hash3 = HashClass.generateHash1(word, map.length);

            if (map[hash1] != 0 && map[hash2] != 0 && map[hash3] != 0) {
                System.out.printf("Word = %s, already present h1 = %s, h2 = %s, h3 = %s %n", word, hash1, hash2, hash3);
            } else {
                map[hash1] = 1;
                map[hash2] = 1;
                map[hash3] = 1;
                System.out.printf("Inserted word = %s, h1 = %s, h2 = %s, h3 = %s %n", word, hash1, hash2, hash3);
            }
        }
    }
}
