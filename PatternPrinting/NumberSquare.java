package PatternPrinting;

import java.util.*;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int row = Sc.nextInt();
     

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
