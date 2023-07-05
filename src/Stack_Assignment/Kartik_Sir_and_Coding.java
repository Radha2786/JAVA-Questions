package Stack_Assignment;
import java.util.*;
import java.util.Stack;

public class Kartik_Sir_and_Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int Q = sc.nextInt();
        while(Q-- >0){
            int n = sc.nextInt();
            if(n==1){
                System.out.println(stack.pop());
            }else{
                int cost = sc.nextInt();
                stack.push(cost);
            }
        }



    }
}
