import java.util.Scanner;
public class Pallindrome{
    public static void main(String args[]){

        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int palliNo = n;

            int ans = 0;

            while(n > 0){
                int rem = n % 10; //Gives the last digit 
                n = n/10;        //remove last digit
                ans = ans * 10 + rem;  //storing new reversed no. into it
                System.out.println(ans);
            }


                if(palliNo == ans){
                     System.out.println(palliNo + " is Pallindrome Number");
                }else{
                     System.out.println(palliNo + " is not Pallindrome Number");
                }
        }
    }
}