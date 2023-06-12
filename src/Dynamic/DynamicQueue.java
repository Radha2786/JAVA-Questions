package Dynamic;

import QUEUE.MeraQueue;

public class DynamicQueue extends MeraQueue {
    @Override
    public void enqueue(int data) throws Exception {
        if(isFull()){
            int[] new_arr = new int[arr.length * 2];

            for(int i = 0 ; i < super.arr.length ; i++){
                int index=(this.front+i)%this.arr.length;
                new_arr[i] = arr[index];
            }
            arr = new_arr;
            this.front = 0;
        }

        super.enqueue(data);
    }
}
