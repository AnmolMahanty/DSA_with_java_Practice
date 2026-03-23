package JAVA_Condition_Code;

import java.util.Scanner;

// Checks whether the entered number is divisible by 5.
public class DivisibleBy5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        // Remainder 0 means exactly divisible.
        if (i % 5 == 0) {
            System.out.println("The number " + i + " is divisible by 5.");
        } else {
            System.out.println("The number " + i + " is not divisible by 5.");
        }
    }

}
