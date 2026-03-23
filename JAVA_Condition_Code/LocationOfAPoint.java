package JAVA_Condition_Code;

import java.util.Scanner;

// Identifies the position of a point on the Cartesian plane.
public class LocationOfAPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x coordinate:");
        int x = sc.nextInt();
        System.out.println("Enter the y coordinate:");
        int y = sc.nextInt();
        // Check quadrants first, then axis cases, then origin.
        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the fourth quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point (" + x + ", " + y + ") is on the y-axis.");
        } else if (x != 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") is on the x-axis.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        }
    }
}
