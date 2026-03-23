package JAVA_Condition_Code;

import java.util.Scanner;

// Determines whether an entered integer is even or odd.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        // Even numbers leave remainder 0 when divided by 2.
        if (i % 2 == 0) {
            System.out.println("The number " + i + " is even.");
        } else {
            System.out.println("The number " + i + " is odd.");
        }
    }
}
