package JAVA_Condition_Code;

import java.util.Scanner;

// Verifies whether three sides can form a valid triangle.
public class VerifyTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the triangle:");
        int a = sc.nextInt();
        System.out.println("Enter the length of the second side of the triangle:");
        int b = sc.nextInt();
        System.out.println("Enter the length of the third side of the triangle:");
        int c = sc.nextInt();
        // Triangle inequality must hold for all three side combinations.
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides " + a + ", " + b + ", and " + c + " can form a triangle.");
        } else {
            System.out.println("The sides " + a + ", " + b + ", and " + c + " cannot form a triangle.");
        }
    }
}
