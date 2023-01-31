import java.util.Scanner;
public class Twodaray{
    public static void main(String args[]){

        Scanner in = new Scanner (System.in);

        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col< arr[row].length; col++){

                arr[row][col] = in.nextInt(); //take input

                System.out.print(arr[row][col] + " "); //printing output

            }

             System.out.println(); // add new line 

        }
       

 

    }
}