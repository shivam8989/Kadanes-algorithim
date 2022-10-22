package array;
import java.util.*;
public class KADANEs_Algo {
    public static void printarray(int arr[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            currentsum = currentsum + arr[i];
            if(currentsum < 0){
                currentsum = 0;

            }
           maxsum =  Math.max(currentsum, maxsum);
        }
        System.out.println("max sum = " +maxsum);

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr [] = {-2,-3,4,-1,-2,1,5,-3};
        printarray(arr);
    }

}
