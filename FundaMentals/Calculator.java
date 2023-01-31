import java.util.Scanner;

public class Calculator{
public static void main(String args[]){
      
      Scanner in = new Scanner(System.in);

      int a = in.nextInt();

      int b = in.nextInt();

      System.out.println("Enter Operator like + - * / ");
      char op = in.next().charAt(0);

      int ans;

      if( op == '+'){
          ans = a + b;
          System.out.println(ans);

        if(op == '-'){
          ans = a - b;
          System.out.println(ans);
        }

        if(op == '*'){
          ans = a * b;
          System.out.println(ans);
        }

        if(op == '/'){
          ans = a / b;
          System.out.println(ans);
        }
        }else{
          System.out.println("enter valid operator");
      }

    }
}