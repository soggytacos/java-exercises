package org.launchcode.java.demos.exercises;

public class WordsOf5 {
    public static void main(String[] args) {
        String[] listOfWords = {"this", "is", "bible", "hello", "bongo", "taste", "poop"};
        for (String word : listOfWords) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
