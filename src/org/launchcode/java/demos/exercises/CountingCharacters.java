package org.launchcode.java.demos.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingCharacters {

    public static void main(String[] args) {

        String latinString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> latinHashMap = new HashMap<>();
        char[] charactersInString = latinString.toCharArray();
        int charCount = 0;

        for (char c : charactersInString) {
            if (!latinHashMap.containsKey(c)) {
                charCount = 0;
                for (char i : charactersInString) {
                    if (i == c) {
                        charCount++;
                    }
                }
                latinHashMap.put(c , charCount);
            }
        }
        for (Map.Entry mapElement : latinHashMap.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
            System.out.println(key + " : " + value);
        }
    }

}
