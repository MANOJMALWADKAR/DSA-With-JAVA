 

public class Search{
    public static void main(String args[]){
        
        int[] nums = {12,45,78,56,1,34,3,32};
        int target = 1;
        int ans = linearSearch(nums, target); //boolean
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target){ //boolean
        if(arr.length == 0){
            return -1;   //false
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return element; //true; 
            }
        }
        return -1;  //false

    }
}