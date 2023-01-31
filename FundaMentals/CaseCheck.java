import java.util.Scanner;

public class CaseCheck{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is LowerCase");

        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " is UpperCase");
        }else{
            System.out.println("this is number");
        }

    }
}