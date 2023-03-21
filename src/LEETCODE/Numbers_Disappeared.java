package LEETCODE;

import java.util.ArrayList;

public class Numbers_Disappeared{
    public static void main(String[] args) {
        int[] arr = {1,1};

        int n = arr.length;
        int[] frequency = new int[n+1];
        ArrayList<Integer> list = new ArrayList<>();
        int pos=0;
        for(int i=0;i<n;i++){
            pos = arr[i];
            frequency[pos]++;
        }
        for (int i = 0; i <n+1; i++) {
            if(i==0){
                continue;
            }
            if (frequency[i] == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

}
