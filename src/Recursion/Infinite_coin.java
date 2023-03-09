package Recursion;

import static Recursion.Having_Infinite_coins.choices_upto_target;

public class Infinite_coin {
    public static void main(String[] args) {
        int target = 6;
        int n = 2;
        System.out.println(choices_upto_target(target , n , 0 , ""));
    }
    static void Choices_upto_target(int target , int sum_till_now , String ans){
        if(sum_till_now == target){
            System.out.println(ans);
            return;
        }

        if(sum_till_now > target){
            return;
        }

//        CHOICE 1
        Choices_upto_target(target , sum_till_now+1 , ans+"1 ");
//        CHOICE 2
        Choices_upto_target(target , sum_till_now+2 , ans+"2 ");
//        CHOICE 3
        Choices_upto_target(target , sum_till_now+3 , ans+"3 ");
    }
}
