package Stack_Assignment;
import java.util.*;
public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
//        int[] arr = {9,11,23,1,15,38,42,37};
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=i+1;
            }else{
                ans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(ans));


    }
}
