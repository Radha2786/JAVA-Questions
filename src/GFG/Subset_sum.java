package GFG;
import java.util.ArrayList;
//import java.util.arrays;
import java.util.*;

public class Subset_sum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList( 2, 3));
        ArrayList<Integer> list = new ArrayList<>();
        int N =arr.size();
        Sum_of_subsets(arr,N,list,0,0);
        Collections.sort(list);
        System.out.println(list);

    }
    static void Sum_of_subsets(ArrayList<Integer> arr , int N , ArrayList<Integer> list,int i,int sum){
        if(i==N){
            list.add(sum);
            return;
        }
        // call of choosing
        Sum_of_subsets(arr,N,list,i+1,sum + arr.get(i));
        // call of not choosing
        Sum_of_subsets(arr,N,list,i+1,sum);
    }
}
