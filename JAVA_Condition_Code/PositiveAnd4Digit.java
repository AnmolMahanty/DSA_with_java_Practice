package JAVA_Condition_Code;

import java.util.*;

// Checks whether the entered value is a positive four-digit number.
public class PositiveAnd4Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        // Valid positive four-digit range is 1000 to 9999.
        if (i > 0 && i > 999 && i < 10000) {
            System.out.println("The number " + i + " is a positive 4-digit number.");
        } else {
            System.out.println("The number " + i + " is not a positive 4-digit number.");
        }
    }
}
