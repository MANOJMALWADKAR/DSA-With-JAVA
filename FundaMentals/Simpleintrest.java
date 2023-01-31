import java.util.Scanner;

public class Simpleintrest{
    public static void main(String args[]){
      
      Scanner in = new Scanner(System.in);

      System.out.println("Enter Principle : ");
      int principle = in.nextInt();

      System.out.println("Enter Rate : ");
      float rate = in.nextFloat();

      System.out.println("Enter Time : ");
      float time = in.nextFloat();

      float simpleintrest = (principle * rate * time) / 100;

      System.out.println(simpleintrest);


    }
}