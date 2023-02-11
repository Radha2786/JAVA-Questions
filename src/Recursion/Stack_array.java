package Recursion;

import java.util.Scanner;

public class Stack_array {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
        Stack s= new Stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();

//        int n = sc.nextInt();
//        int[] arr = new int[n];
    }

    static class  Stack {
        int st[];
        int top;
        int size;


        // creating stack
        Stack(int n) {
            size =n;
            st=new int[size];
            top=-1;

        }
//        PUSHING ELEMENT

        void push(int n){
            if(top==size-1){
                System.out.println("overflow");
            }else{
                top=top+1;
                st[top]=n;
            }
        }
//        POPPING ELEMENT

        int pop(){
            if(top==-1){
                System.out.println("underflow");
                return 999;
            }else{
                int val=st[top];
                top=top-1;
                return val;
            }
        }
//        DISPLAYING ELEMENTS

        void display(){
            if(top == -1){
                System.out.println("the stack is empty ");
            }else{
                System.out.println("the elements in the stack are: ");
                for(int i=top;i>=0;i--){
                    System.out.println(st[i]);
                }
            }
        }
    }
}
