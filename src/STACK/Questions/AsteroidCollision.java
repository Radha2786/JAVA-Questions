package STACK.Questions;
import java.util.*;
// YouTube
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {10,2,-5};
        Stack<Integer> stack = new Stack<>();
        for(int val : arr){
            if(val>0){
                stack.push(val);
            }else{
                // conditions of collision
//                when directions are different
                while(stack.size()>0 && stack.peek()>0 && stack.peek()<-val){
                    stack.pop();
                }
                if(stack.size()>0 && stack.peek()== -val){
                    stack.pop();
                } else if (stack.size()>0 && stack.peek()>-val) {

                }else{
                    stack.push(val);
                }
            }
        }
        int[] ans= new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=stack.pop();
        }
//        return ans;
        System.out.println(Arrays.toString(ans));
    }
}
