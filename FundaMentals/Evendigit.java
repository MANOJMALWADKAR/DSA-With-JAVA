import java.util.Scanner;
 
public class Evendigit {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      int[] a = {12,11,456,789,4565};
      int count = 0;
       
      for(int i=0; i < a.length; i++){
    
      System.out.println(a[i]);
          
        int newcount = 0;
          
        while(a[i] != 0){
          a[i] = a[i]/10;
          newcount++;
        }

        if(newcount % 2 ==0){
          count++;
        } 
      }
           
      System.out.println("total count is : " + count);

  }
}
     
 

 
