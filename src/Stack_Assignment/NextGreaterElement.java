package Stack_Assignment;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
//            int[] arr = {11,13,21,3};
            int[] ans = new int[arr.length];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                while (!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                    int index = stack.pop();
                    ans[index]=arr[i];
                }
                stack.push(i);
            }
            while(!stack.isEmpty()){
                int index=stack.pop();
                ans[index]=-1;
            }
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]+","+ans[i]);
            }
//            System.out.println(Arrays.toString(ans));

        }

    }
}
