package STACK.Questions;
import java.util.*;

public class Baseball_Game {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String[] ops = {"5","2","C","D","+"};
        for(int i=0;i<ops.length;i++){
            String ch = ops[i];
            if(ch.equals("C")){
                stack.pop();

            }else if(ch.equals("D")){
                int n =stack.peek();
//                int num=Integer.parseInt(n);
                int d = 2*n;
                stack.push(d);


            } else if(ch.equals("+")){
                int n =stack.pop();
                int n2= stack.peek();
//                int num=Integer.parseInt(n);
//                int num2=Integer.parseInt(n2);
                int sum=n+n2;
                stack.push(n);
                stack.push(sum);

            }
            else{
                stack.push(Integer.parseInt(ch));

            }


        }

        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}
