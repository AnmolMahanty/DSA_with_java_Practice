package JAVA_Loop_Code;

import java.util.*;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit = sc.nextInt();
        System.out.println("Even numbers up to " + limit + ":");
        for (int i = 0; i <= limit; i += 2) {

            System.out.print(i + " ");

        }
    }
}
