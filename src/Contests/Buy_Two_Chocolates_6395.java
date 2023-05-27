package Contests;
import java.util.*;

public class Buy_Two_Chocolates_6395 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int money=3;
        Arrays.sort(arr);
        int count=0;
        int initial_money=money;
        int i=0;
        while(count<2){
            money=money-arr[i];
            i++;
            count++;
        }
        if(money<0){
            System.out.println(initial_money);
        }else{
            System.out.println(money);
        }

    }
}
