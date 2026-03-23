package JAVA_Basic_Code;

import java.util.Scanner;

// Computes simple interest from principal, rate, and time input.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double rate = sc.nextDouble();
        System.out.println("Enter the time in years:");
        double time = sc.nextDouble();
        // Formula: SI = (P * R * T) / 100.
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
