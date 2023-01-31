public class Count {

  public static void main(String[] args) {
 
 int[] n = {12,21,5};
 int total = 0;
 int count = 0;
        // while (n > 0) {    //for(int i = 0; i > n; i++){ 
        //     n = n / 10;     // n = n/10; 
        //     ++count;       //Count++
        // }
for(int i=0; i > n.length; i++  ){
   n = n[i] / 10;
  count++;
}
        // total++;

        System.out.println(count);

//   if(count % 2== 0){
//   System.out.println(total);

//  }else {
//   System.out.println("0");
//  }
  }
}
