package JAVA_Basic_Code;

import java.util.*;

// Reads three integers from the user and prints their sum.
public class AddThreeNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter three numbers to find their sum:");
        num1 = Sc.nextInt();
        num2 = Sc.nextInt();
        num3 = Sc.nextInt();
        // Add all three inputs.
        int sum = num1 + num2 + num3;
        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum);
    }

}
