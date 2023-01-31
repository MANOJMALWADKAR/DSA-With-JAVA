import java.util.Scanner;

public class Doubleno{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);


        while(true){
            int num = in.nextInt();

            int temp = num;
            num=num+temp;
            System.out.println(num); 
            break;
        }
 
    }
}