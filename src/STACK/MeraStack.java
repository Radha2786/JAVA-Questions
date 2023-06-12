package STACK;

import java.util.Arrays;

public class MeraStack {

    protected int[] arr;
    private int top;

    public MeraStack(){
        this.arr = new int[5];
        this.top = 0;
    }

    public MeraStack(int capacity){
        this.arr = new int[capacity];
        this.top = 0;
    }

    public boolean isEmpty(){
        return this.top == 0;
    }

    public boolean isFull(){
        return this.top == this.arr.length;
    }

    public void push(int data) throws Exception {

        if(isFull()){
            throw new Exception("BAKLOL STACK FULL HYY!!!");
        }

        arr[this.top] = data;
        this.top++;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("BAKLOL STACK EMPTY HYY!!!");
        }
        this.top--;
        return arr[this.top];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("BAKLOL STACK EMPTY HYY!!!");
        }
        return arr[this.top-1];
    }

    public void display(){

        int tp = top - 1;
        while (tp >= 0){
            System.out.print(arr[tp--] + " ");
        }

        System.out.println();
    }

}
