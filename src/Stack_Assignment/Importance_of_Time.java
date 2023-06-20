package Stack_Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Importance_of_Time {
    public static void main(String[] args) {
        /**
         5
         5 4 2 3 1
         5 2 1 4 3
         **/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> calling_order = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            calling_order.add(sc.nextInt());
        }
        Queue<Integer> ideal_order = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            ideal_order.add(sc.nextInt());
        }
        System.out.println(steps_to_execute_all_processes(calling_order , ideal_order));

    }

    static int steps_to_execute_all_processes(Queue<Integer> calling , Queue<Integer> ideal){
        int steps = 0;
        while (!calling.isEmpty()){
            System.out.println(calling);
            System.out.println(ideal);
            if(calling.peek() == ideal.peek()){
                System.out.println("calling -> " + calling.remove());
                System.out.println("ideal -> " + ideal.remove());
            }
            else{
                int data = calling.remove();
                calling.add(data);
            }
            steps++;
        }
        return steps;
    }
}
