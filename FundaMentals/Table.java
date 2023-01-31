import java.util.Scanner;

public class Table{
    public static void main(String args[]){

         System.out.print("Enter a Number: ");

        Scanner in = new Scanner(System.in);

        int table = in.nextInt();
        
        for(int i = 1; i <= 10; i++){
            int multi = table * i;
            System.out.println(multi);
        }

    }
}