import java.util.Scanner;

public class Triangle{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter A base : ");
        double base = in.nextFloat();

        System.out.println("Enter A height : ");
        double height = in.nextFloat();

        double area = 0.5 *  base * height;

        System.out.println("Area of triangle : " + area);

         
    }
}