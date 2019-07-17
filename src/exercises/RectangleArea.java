package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(Double[] args) {
        double hight = 0;
        double width = 0;
        double area = hight * width;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the hight of the rectangle?");
        hight = in.nextDouble();
        System.out.println("What is the width of the rectangle?");
        width = in.nextDouble();
        System.out.println("The area of your rectangle is " + area + ".");
    }
}
