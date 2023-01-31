import java.util.Scanner;
public class CountingOccurance{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int fn = in.nextInt();
        int sn = in.nextInt();
        int count = 0;

        while(fn > 0){
            int rem = fn % 10;

            if(sn == rem){
                count++;
            }
        fn = fn/10;
        }
        System.out.println(count);
    }
}