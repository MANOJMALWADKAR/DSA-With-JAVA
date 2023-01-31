import java.util.Scanner;

public class Evenodd{

public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int num = in.nextInt();

    if(num == 0){
        System.out.println(num + " is Neutral Number");
    }if(num % 2 == 0){
        System.out.println(num + " is Even Digit");
    }else{
        System.out.println(num + " is Odd Digit");
    }
}
}