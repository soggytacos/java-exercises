package org.launchcode.java.demos.exercises;

import java.util.ArrayList;

public class fiveGuys {
    public static void main (String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("chess");
        alist.add("beach");
        alist.add("water");
        alist.add("freak");
        alist.add("three");
        alist.add("brick");
        alist.add("hello");
        alist.add("frontend");
        alist.add("six");
        alist.add("coffee");

        printAnswer(alist);
    }

    public static void printAnswer (ArrayList<String> alist) {

        for (String word : alist) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
