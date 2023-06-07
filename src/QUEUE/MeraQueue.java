package QUEUE;

import java.util.Arrays;

public class MeraQueue {
    protected int[] arr;
    protected int front;
    public int size;

    public MeraQueue(){
        this.arr = new int[5];
        this.front = this.size = 0;
    }

    public MeraQueue(int capacity){
        this.arr = new int[capacity];
        this.front = this.size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == this.arr.length;
    }

    public void enqueue(int data) throws Exception {
        if(isFull()){
            throw new Exception("BAKLOL QUEUE FULL HYY!!!");
        }
//        arr[this.size] = data;
//        int insertionPoint = this.size + this.front;

//        CIRCULAR QUEUE
        int insertionPoint = (this.size + this.front) % arr.length;
        arr[insertionPoint] = data;
        this.size++;
    }

    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("BAKLOL QUEUE EMPTY HYY!!!  ");
        }
        int data = this.arr[this.front];
        this.front++;
        this.front = this.front % arr.length;
        this.size--;
        return data;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("andhe bkl QUEUE EMPTY HYY!!!  ");
        }

        return arr[this.front];

    }

    public void display(){
//        System.out.println("FRONT -> " + front);
//        System.out.println(Arrays.toString(arr));

        int sp = front;
        for(int i = 0 ; i < this.size ; i++){
            int idx = (this.front+i)%this.arr.length;
            System.out.print(this.arr[idx]+" ");
//            System.out.print(arr[sp] + " ");

//            sp = (sp + 1) % arr.length;
        }
        System.out.println();
    }
}
