package STACK.Questions;

import java.util.Stack;

public class Number_of_NGEs_to_the_right {

    public static void main(String[] args) {
        int[] arr={3,4,2,7,5,8,10,6};
        int queries=2;
        int[] indices={0,5};
        for(int j=0;j<queries;j++){
            int count=0;
            int index=indices[j];
            for(int i=index+1;i<arr.length;i++){
                if(arr[i]>arr[index]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
    }

