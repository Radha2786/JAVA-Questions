package LEETCODE;

public class gfg {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,8,10};
        int p1=0,value_1=0,value_2=0;
        int p2=p1+1;
        int max=0,k=10;
        while(p1<arr.length-1){
            if(arr[p1]+arr[p2]<k){
                if(arr[p1]+arr[p2]>max) {
                    max = arr[p1] + arr[p2];
                    value_1 = arr[p1];
                    value_2 = arr[p2];
                }
                p2++;
            }else{
                p1++;
                p2=p1+1;
            }
        }
        System.out.println(value_1+" "+value_2);
    }
}
