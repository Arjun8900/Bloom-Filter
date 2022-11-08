package com.bloomfilter;

public class HashClass {

    public static int generateHash1(String s, int range) {
        int hash = 0;
        for (char ch: s.toCharArray()) {
            hash = (hash + ch) % range;
        }
        return (hash + hash) % range;
    }

    public static int generateHash2(String s, int range) {
        int hash = 0;
        for (char ch: s.toCharArray()) {
            hash += (ch + ch) % range;
        }
        return (hash + hash) % range;
    }

    public static int generateHash3(String s, int range) {
        int hash = 0;
        for (char ch: s.toCharArray()) {
            hash += (ch * ch) % range;
        }
        return (hash + hash) % range;
    }
}
