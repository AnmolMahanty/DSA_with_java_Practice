package JAVA_Condition_Code;

import java.util.Scanner;

// Checks whether the entered input token is an integer.

public class IntergerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        // hasNextInt validates the token before attempting to read it as int.
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println("The number " + i + " is an integer.");
        } else {
            System.out.println("The input is not an integer.");
        }
    }
}