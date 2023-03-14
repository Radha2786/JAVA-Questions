package LEETCODE;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeArrayMaximizePrefixScore {
    public static void main(String[] args) {

        int count =0;
        int[] num = {2,-1,0,1,-3,3,-3};
        int[] prefix = new int[num.length];
//        Arrays.sort(num);
//        Arrays.sort(num,0,7, Collections.reverseOrder());
        int previous =0 , next =0;
        for(int i=0;i<num.length ; i++){
            next = num[i];
            prefix[i]=previous + next;
            previous = prefix[i];
        }
        for(int j=0;j<prefix.length ;j++){
            if(prefix[j]>0){
                count++;
            }
        }
//        return count;
        System.out.println(count);
    }
}
