package HashMap_Heap_Assignment;

import java.util.HashMap;
import java.util.Scanner;
public class Unlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        // putting integer and it's index in hashmap
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<N && k>0;i++){
            if(arr[i]!=N-i){
                int i1=map.get(N-i);
                int i2=i;
                map.put(N-i,i2);
                map.put(arr[i],i1);
                Swap(arr,i1,i2);
                k--;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void Swap(int[] arr,int i1,int i2){
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}
