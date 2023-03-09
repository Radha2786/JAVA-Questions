package Exams;

import java.util.Arrays;

public class Queue_Using_Array {
    public static void main(String[] args) {
        MyQueue ob = new MyQueue(5);
        ob.enqueue(1);
        ob.enqueue(2);
        ob.enqueue(3);
        ob.enqueue(4);
        ob.enqueue(5);
        ob.enqueue(6);

//        System.out.println(Arrays.toString(ob.arr));
        while (ob.rear != -1){
            System.out.println(ob.dequeue());
        }
    }
}
class MyQueue{
    int capacity;
    int front;
    int rear;
    int[] arr;

    public MyQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = -1;
    }

//    ENQUEUE
    void enqueue(int data){

//        OVERFLOW
        if(rear == capacity-1){
            System.out.println("QUEUE IS FULL");
            return;
        }

//        QUEUE IS EMPTY
        if(front == -1){
            front++;
            rear++;

            arr[rear] = data;
            return;
        }

        rear++;
        arr[rear] = data;
    }

//    DEQUEUE

    int dequeue(){

//        UNDERFLOW
        if(rear == -1){
            System.out.println("UNDERFLOW");
            return -1;
        }

        int element_to_be_deleted = arr[0];

//        LEFT SHIFT
        for (int i = 0 ; i < rear ; i++){
            arr[i] = arr[i+1];
        }

        rear--;
        if(rear == -1){
            front = -1;
        }
        return element_to_be_deleted;
    }

//    OFFER OR SEE-FRONT

    int offer(){
        if(rear == -1){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }

        return arr[0];
    }
}
