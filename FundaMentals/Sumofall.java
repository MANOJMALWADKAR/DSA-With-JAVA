import java.util.Scanner;

public class Sumofall{

    public static void main(String args[]){

      Scanner in = new Scanner(System.in);


      int n;
      int sum = 0;
       
      while(true){
        n = in.nextInt();
        
        if(n ==0){
          break;
        }
        sum = sum +n;
      }
      System.out.println(sum);
      

       

 
    }
}