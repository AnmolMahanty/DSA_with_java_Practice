package JAVA_Condition_Code;

import java.util.*;

// Prints the absolute value of an entered integer.
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        // If negative, flip the sign; otherwise value stays the same.
        if (i < 0) {
            System.out.println("The absolute value of " + i + " is: " + (-i));
        } else {
            System.out.println("The absolute value of " + i + " is: " + i);
        }
    }
}
