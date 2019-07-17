package org.launchcode.java.demos.java4python;

import java.util.Scanner;
/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String userName;
        System.out.println("What's your name?");
        userName = in.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
