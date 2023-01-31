import java.util.Scanner;
public class Leetcode1281{
    public static void main(String args[]){

         int num = 237;
         
         int sum = 0;
         int product = 1;

         while(num != 0){

            int digit = num % 10;

            product = product * digit;

            sum = sum + digit;

            num /=10;
            
         }

          int result = product - sum;

          System.out.println(result);

         
    }
}