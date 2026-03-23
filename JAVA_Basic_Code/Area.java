package JAVA_Basic_Code;

import java.util.Scanner;

// Calculates the area of a circle using the entered radius.
public class Area {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius of the circle :");
        radius = Sc.nextDouble();
        // Formula: area = pi * r^2.
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
