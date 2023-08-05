package STACK.Questions;
import java.util.*;

public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + gain[i-1];
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
