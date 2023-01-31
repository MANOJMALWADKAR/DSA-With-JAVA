 import java.util.Scanner;
 
public class Currency {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
       
       double dollar = 0.012;

       System.out.println("Enter currency in Rupees : ");
       double a = in.nextInt();

       double rupees = 0;
       rupees = dollar * a;

       System.out.println("$" + rupees);




        


        

    }
}
     
 

 

