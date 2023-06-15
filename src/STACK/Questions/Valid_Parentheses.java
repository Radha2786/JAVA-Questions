package STACK.Questions;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0 ; i < s.length() ; i++){
//            char ch = s.charAt(i);
//
//            if(ch == '(' || ch == '{'|| ch == '['){
//                stack.push(ch);
//            }
//            else{
//                if(ch == ')' && stack.peek() == '('){
//                    stack.pop();
//                } else if (ch == ']' && stack.peek() == '[') {
//                    stack.pop();
//                } else if (ch == '}' && stack.peek() == '{') {
//                    stack.pop();
//                }
//                else {
//                    return false;
//                }
//            }
//        }
//
//        if(stack.isEmpty()){
//            return true;
//        }
//
//        return false;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            int value = digit(ch);
            if(value > 0){
                stack.push(value);
            }
            else{
                int top = stack.pop();
                if(top + value != 0){
                    return false;
                }
            }
        }

//        return stack.isEmpty();
        return true;
    }

    static int digit(char ch){
        if(ch == '('){
            return 1;
        }
        if(ch == ')'){
            return -1;
        }
        if(ch == '{'){
            return 3;
        }
        if(ch == '}'){
            return -3;
        };
        if(ch == '['){
            return 2;
        } else{
            return -2;
        }
    }
}
