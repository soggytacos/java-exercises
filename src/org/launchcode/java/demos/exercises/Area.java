package org.launchcode.java.demos.exercises;

import static java.lang.Math.PI;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of your circle:");
        double radius = in.nextDouble();
        if (radius < 0) {
            do {
                System.out.println("Area must be a positive number.");
                radius = in.nextDouble();
            } while (radius < 0);
        }
        double area = PI * radius * radius;
        System.out.println(area + "is the area of a circle with radius " + radius);

    }
}
