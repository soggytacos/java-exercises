package org.launchcode.java.demos.exercises;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        int sum = 0;
        int newNumber;
        System.out.println("Enter a number or hit '0' to exit.");

        do {
            newNumber = in.nextInt();
            if (newNumber != 0) {
                listOfNumbers.add(newNumber);
            }
        } while(newNumber != 0);

        for (Integer i : listOfNumbers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all the even numbers is " + sum);
        System.out.println("This is the list of numbers:" + listOfNumbers);

    }



}
