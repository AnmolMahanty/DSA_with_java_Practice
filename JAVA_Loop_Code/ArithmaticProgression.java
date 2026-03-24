package JAVA_Loop_Code;

import java.util.*;

public class ArithmaticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term (a):");
        int a = sc.nextInt();
        System.out.println("Enter the common difference (d):");
        int d = sc.nextInt();
        System.out.println("Enter the number of terms (n):");
        int n = sc.nextInt();
        System.out.println("Arithmetic Progression:");
        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
        }
    }
}
