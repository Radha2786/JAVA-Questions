package Stack_Assignment;

import QUEUE.MeraQueue;

import java.util.Scanner;

public class TheQueueGame {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        while(t-- >0) {
//            int n = sc.nextInt();
//            MeraQueue ob = new MeraQueue(n);
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            for (int i = 0; i < arr.length; i++) {
//                        if (arr[i] == 1) {
//                            ob.enqueue(arr[i]);
//                        } else {
//                            if (ob.isEmpty()) {
//                                System.out.println("Invalid");
//                                return;
//                            } else {
//                                ob.dequeue();
//                            }
//                        }
//                    }
//                    System.out.println("valid");
//                }
//    }


        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(isValid(arr)){
                System.out.println("isValid");
            }else{
                System.out.println("Invalid");
            }
        }
    }
    public static boolean isValid(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==1){
               sum++;
           }else{
               sum--;
           }
        }
        if(sum<0){
            return false;
        }else{
            return true;
        }
    }
}
