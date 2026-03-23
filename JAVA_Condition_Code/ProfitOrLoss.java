package JAVA_Condition_Code;

import java.util.Scanner;

// Compares cost and selling price to determine profit, loss, or no change.
public class ProfitOrLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        double costPrice = sc.nextDouble();
        System.out.println("Enter the selling price:");
        double sellingPrice = sc.nextDouble();
        // Profit occurs when selling price is greater than cost price.
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("You made a profit of: " + profit);
        } else if (sellingPrice < costPrice) {
            // Loss occurs when selling price is lower than cost price.
            double loss = costPrice - sellingPrice;
            System.out.println("You incurred a loss of: " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
