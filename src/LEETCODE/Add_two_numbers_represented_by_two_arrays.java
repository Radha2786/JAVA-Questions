package LEETCODE;

import java.util.ArrayList;

public class Add_two_numbers_represented_by_two_arrays {
    public static void main(String[] args) {
        int[] arr1 = {2,1};
        int[] arr2 = {9,9,9};
        int p1= arr1.length-1;
        int p2= arr2.length-1;
        int carry=0,sum=0;
        int digit=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(p1>=0 && p2>=0){
             sum=arr1[p1]+arr2[p2]+carry;
            carry=sum/10;
            digit=sum%10;
            list.add(0,digit);
            p1--;
            p2--;
        }
        if(p1!=-1) {
            while (p1 >= 0) {
                sum = arr1[p1] + carry;
                carry = sum / 10;
                digit = sum % 10;
                list.add(0, digit);
                p1--;

            }
        }else{
            while(p2>=0){
                sum=arr2[p2]+carry;
                carry=sum/10;
                digit=sum%10;
                list.add(0,digit);
                p2--;
            }
        }
        if(carry!=0){
            list.add(0,carry);
        }
        System.out.println(list);
            }


}
