package Dynamic;

import QUEUE.MeraQueue;

public class DynamicQueue extends MeraQueue {
    @Override
    public void enqueue(int data) throws Exception {
        if(isFull()){
            int[] new_arr = new int[arr.length * 2];

            for(int i = 0 ; i < size ; i++){
                new_arr[i] = arr[front];
                front = (front + 1) % arr.length;
            }

            front = 0;
            arr = new_arr;
        }

        super.enqueue(data);
    }
}
