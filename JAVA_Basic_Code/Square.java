package JAVA_Basic_Code;

import java.util.*;

// Reads an integer and prints its square.
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its square:");
        int num = sc.nextInt();
        // Multiply the number by itself.
        int square = num * num;
        System.out.println("The square of " + num + " is: " + square);
    }
}
