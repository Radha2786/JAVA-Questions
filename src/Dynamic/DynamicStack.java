package Dynamic;

import STACK.MeraStack;

public class DynamicStack extends MeraStack {

    @Override
    public void push(int data) throws Exception {

        if(isFull()){
            int[] new_arr = new int[arr.length * 2];
            for(int i = 0 ; i < arr.length ; i++){
                new_arr[i] = arr[i];
            }
            arr = new_arr;
        }

        super.push(data);
    }

}
