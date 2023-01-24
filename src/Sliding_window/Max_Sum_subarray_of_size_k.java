package Sliding_window;

public class Max_Sum_subarray_of_size_k {
    public static void main(String[] args) {
        int s=0,e=0,max=0;
        int[] arr = {100, 200, 300, 400};
        int k=2;
        int current=0;
        while(e<k){
            max+=arr[e];
            e++;
        }
        //growing window
        current = max;
        while(e<arr.length){
            max+=arr[e];
            //shrinking the window
            max-=arr[s];
            if(max>current){
                current=max;
            }
            e++;
            s++;
        }
        System.out.println(max);
    }
}
