package JAVA_Loop_Code;
import java.util.*;
public class OddNumberDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit = sc.nextInt();
        System.out.println("Odd numbers divisible by 3 up to " + limit + ":");
        for (int i =1; i<= limit; i+=2){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
