package Recursion;

import java.util.*;

//public class infixtopostfix {
//}

import java.util.*;

class Stack1
{
    private char s[];

    private int top;

    private int maxsize;


    Stack1(int size) {

        s = new char[size];
        maxsize = size;
        top = -1;
    }


    public void push(char x)
    {
        if (isFull()) {
            System.out.println("Stack OverFlow");


            System.exit(1);
        }

        System.out.println("Inserting " + x);
        s[++top] = x;
    }


    public char pop()
    {

        if (isEmpty())
        {
            System.out.println("STACK EMPTY");

            System.exit(1);
        }

        return s[top--];
    }


    public int getSize()
    {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty()
    {
        return top == -1;
    }


    public Boolean isFull()
    {
        return top == maxsize - 1;
    }

    public char peek()
    {
        if(!this.isEmpty())
            return s[top];
        else
        {
            System.out.println("Stack is Empty");
            return  '\0'; //null character
        }
    }


}  //stack class close

public class infixtopostfix
{

    // precedence
    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }


    static String infixToPostfix(String exp)
    {

        String result = new String("");

        Stack1 stack=new Stack1(20);
        for (int i = 0; i < exp.length(); ++i)
        {
            char c = exp.charAt(i);

            // operand
            if (Character.isLetterOrDigit(c))
                result += c;


                // '('
            else if (c == '(')
                stack.push(c);

                //  ')'
            else if (c == ')' )
            {
                while (!stack.isEmpty() && stack.peek() != '(' )
                {
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else   // an operator
            {
                while (!stack.isEmpty() && Prec(c) < Prec(stack.peek()) )
                {
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);

            }
            System.out.println(result);
        }

        // remaining
        while (!stack.isEmpty())
        {
            if (stack.peek() == '(' )
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
        return result;
    }


    public static void main(String[] args)
    {
//        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        String exp = "k+l-m*n+(o^p)*w/u/v*t+q";

        System.out.println(infixToPostfix(exp));
    }
}
