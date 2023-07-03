package STACK.Questions;
import java.lang.reflect.Array;
import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,1,2,0,5};
        int k = 3;
        int[] ans=MaxWindow(nums,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] MaxWindow(int[] arr,int k){
        int n=arr.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> deque= new LinkedList<>();
        // 1st calculate max for first window
        for(int i=0;i<k;i++){
            while(!deque.isEmpty() && arr[deque.getLast()]<arr[i]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        ans[0]=arr[deque.getFirst()];
        int j=1;
        for(int i=k;i<n;i++){
            while(!deque.isEmpty() && deque.getFirst()<=i-k){
                deque.removeFirst();
            }
            while (!deque.isEmpty()&& arr[deque.getLast()]<arr[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            ans[j++]=arr[deque.getFirst()];

        }
        return ans;




    }
}
