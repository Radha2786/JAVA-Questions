package LEETCODE;

public class Smallest_value {
    public static void main(String[] args) {
        long num = 310l;
        int[] arr = new int[10];
        String ans="";
        if(num>0){
            while(num>0){
                int t=(int)(num%10);
                arr[t]++;
            }
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=0){
                    ans=ans+i;
                    arr[i]--;
                    if(arr[0]!=0){
                        ans=ans+0;
                        arr[0]--;
                    }


                }
            }


        }
    }
}
