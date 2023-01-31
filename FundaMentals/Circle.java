import java.util.Scanner;

public class Circle{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        double pie = 3.14;

        System.out.println("Enter a radius : ");
        double radius = in.nextFloat();

        double area = pie * (radius * radius);

        System.out.println("Area of Circle is : " + area);
    }
}