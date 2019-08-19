package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many miles have you driven today?");
        double miles = in.nextDouble();
        System.out.println("How many gallons of gas have you consumed today?");
        double gallons = in.nextDouble();
        double gasMileage;
        gasMileage = miles / gallons;
        System.out.println("Your gas mileage today was " + gasMileage + ".");
    }
}
