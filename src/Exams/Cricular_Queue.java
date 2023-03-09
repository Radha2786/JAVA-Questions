package Exams;

import java.util.Arrays;

public class Cricular_Queue {
    int[] arr;
    int front ;
    int rear;

    public Cricular_Queue(int capacity){
        arr = new int[capacity];
        front = rear = -1;
    }

//    ENQUEUE
    void enqueue(int data){
//        QUEUE IS EMPTY
        if(front == -1){
            front++;
            rear++;
            arr[rear] = data;
            return;
        }

//        OVERFLOW
        if(rear+1% arr.length == front){
            System.out.println("QUEUE IS FULL");
            return;
        }

        rear = rear+1 % arr.length;
        arr[rear] = data;
    }

//    DEQUEUE
    int dequeue(){
//        UNDERFLOW
        if(front == -1){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }

        int data_to_be_deleted = arr[front];
        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front+1) % arr.length;
        }
        return data_to_be_deleted;
    }

//    OFFER
    int offer(){
        //        UNDERFLOW
        if(front == -1){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }

        return arr[front];
    }

    public static void main(String[] args) {
        Cricular_Queue ob = new Cricular_Queue(4);
        ob.enqueue(1);
        ob.enqueue(2);
        ob.enqueue(3);
        ob.enqueue(4);
        while (ob.front != -1){
            System.out.println(ob.dequeue());
            System.out.println("FRONT -> " + ob.front);
            System.out.println("REAR -> " + ob.rear);

            System.out.println(Arrays.toString(ob.arr));
        }
    }
}
