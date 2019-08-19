package org.launchcode.java.demos.exercises;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String[] splitSentence = sentence.split("\\s+");

        System.out.println("Type a word to see if it is in the sentence from Alice in Wonderland.");
        String userWord = in.nextLine();
        userWord = userWord.toLowerCase();
        boolean result = false;
        for (String word : splitSentence) {
            word = word.toLowerCase();
            if (word.contains(userWord)) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
