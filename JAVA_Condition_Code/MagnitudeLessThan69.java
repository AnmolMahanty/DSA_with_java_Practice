package JAVA_Condition_Code;

import java.util.Scanner;

// Checks if the number lies within the range (-69, 69).
public class MagnitudeLessThan69 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = Sc.nextInt();
        // Equivalent to |i| < 69 without calling Math.abs.
        if (i < 69 && i > -69) {
            System.out.println("The magnitude of " + i + " is less than 69.");
        } else {
            System.out.println("The magnitude of " + i + " is not less than 69.");
        }

    }
}
