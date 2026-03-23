package JAVA_Condition_Code;

import java.util.Scanner;

// Checks whether the entered number is divisible by 3 or by 5.
public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        // Logical OR allows either divisibility condition.
        if (i % 3 == 0 || i % 5 == 0) {
            System.out.println("The number " + i + " is divisible by 3 or 5.");
        } else {
            System.out.println("The number " + i + " is not divisible by 3 or 5.");
        }
    }
}
