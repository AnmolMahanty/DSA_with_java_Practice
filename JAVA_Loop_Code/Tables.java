package JAVA_Loop_Code;
import java.util.*;
public class Tables {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print its table:");
        int number = sc.nextInt();
        System.out.println("Multiplication table of " + number + ":");
        int i=1;
        while(i<=10){
            System.out.println(number +" X "+i+" = "+(number*i));
            i++;
        }
    }
}
