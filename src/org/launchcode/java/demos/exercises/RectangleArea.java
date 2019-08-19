package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("What is the hight of the rectangle?");
        double height = in.nextDouble();
        System.out.println("What is the width of the rectangle?");
        double width = in.nextDouble();
        double area = height * width;
        System.out.println("The area of your rectangle is " + area + ".");
    }
}
