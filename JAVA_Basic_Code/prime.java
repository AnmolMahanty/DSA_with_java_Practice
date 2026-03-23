package JAVA_Basic_Code;

import java.util.Scanner;

// Checks whether the entered number is prime.
public class prime {
    public static void main(String[] args) {
        System.out.println("Check if a number is prime:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        // A non-prime number has a factor at most up to sqrt(num).
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && num > 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
