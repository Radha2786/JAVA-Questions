package Contests;
public class LongestEvenOddSubarrayWithThreshold {
    public static void main(String[] args) {
        int[] arr ={3,2,6,2,5,4};
        int th =5;
        int ans = 0;
        int s = 0;
        int max = 0;
        while(s<arr.length){
            if(arr[s]<=th && arr[s]%2==0){
                int current=1;
                int e=s+1;
                while(e<arr.length){
                    if(arr[e]%2 != arr[e-1]%2 && arr[e]<=th){
                        current++;
                        e++;
                    }else{
                        break;
                    }
                }
                if(current>=max){
                    max=current;
                }
                s=e;

            }else{
                s++;
            }
        }
        System.out.println(max);
    }
    }

