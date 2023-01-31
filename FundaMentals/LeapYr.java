import java.util.Scanner;

public class LeapYr{
    public static void main(String args[]){
    
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

 if( num % 4 == 0){
    if(num % 100 == 0){
        if(num % 400 == 0){
            System.out.println("Leap year");
        }else{
            System.out.println("not Leap year");
        }
    }else{
            System.out.println("Leap year");
        }
 } else{
            System.out.println(" not Leap year");
        }
    }
}