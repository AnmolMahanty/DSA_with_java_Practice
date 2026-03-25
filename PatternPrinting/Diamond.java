package PatternPrinting;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        int i;

        for (i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 0; i < row - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 2 * (row - 1 - i) - 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
