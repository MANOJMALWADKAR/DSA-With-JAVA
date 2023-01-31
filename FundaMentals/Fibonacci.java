import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int a = 0;
        int b = 1;
        int i=1;

        while(i <= n){
         System.out.println(a);
             int temp = a + b;
             a = b;
             b = temp;
             i++;
        }
    }
}