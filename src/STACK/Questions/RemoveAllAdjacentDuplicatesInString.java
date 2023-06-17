package STACK.Questions;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String str = "abbaca";
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }
            while(!stack.isEmpty()){
                if(str.charAt(i)!=str.charAt(stack.peek())){
                    stack.push(i);
                    break;
                }else{
                    stack.pop();
                    break;
                }
            }

        }

        String res="";
        while(!stack.isEmpty()){
            res =str.charAt(stack.pop())+res;
        }
        System.out.println(res);
    }
}
