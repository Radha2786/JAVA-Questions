package STACK.Questions;
import java.util.*;

public class Car_Fleet {
    public static void main(String[] args) {
        int target = 12;
        int[]position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};

        Pair[] arr = new Pair[speed.length];
        for(int i = 0 ; i < arr.length ; i++){
            Pair ob = new Pair(position[i] , speed[i]);
            arr[i] = ob;
        }

        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.pos - o2.pos;
            }
        });

    }

    static int fleets(Pair[] arr , int target){
        Stack<Pair> stack = new Stack<>();
        for(int i = arr.length-1 ; i >= 0 ; i--){
            stack.push(arr[i]);
            if(stack.size() > 1){
                Pair current = stack.pop();
                Pair previous = stack.peek();

                double current_time = (target - current.pos) / (current.speed * 1.0);
                double previous_speed = (target - previous.pos) / (previous.speed * 1.0);

                if(current_time > previous_speed){
                    stack.push(current);
                }
            }
        }

        return stack.size();
    }
}

class Pair{
    int pos;
    int speed;
    public Pair(int pos , int speed){
        this.pos = pos;
        this.speed = speed;
    }
}
