package Recursion;

public class Having_Infinite_coins {
    public static void main(String[] args) {
        int target = 6;
//        int n = 2;
//        System.out.println(choices_upto_target(target , n , 0 , ""));
        Choices_upto_target(target , 0 , "");

    }

//    FOR 3 CHOICES
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

    static int Counter(int target , int sum_till_now , String ans){
        if(sum_till_now == target){
            System.out.println(ans);
            return 1;
        }
        if(sum_till_now > target){
            return 0;
        }
        int count=0;
        count+= (Counter(target , sum_till_now+1 , ans+"1 "));

        count+=(Counter(target , sum_till_now+2 , ans+"2 "));

        count+=(Counter(target , sum_till_now+3 , ans+"3 "));
        return count;
    }

//    FOR N NUMBER OF CHOICES
    static int choices_upto_target(int target , int n , int sum_till_now , String ans){
        if(sum_till_now == target){
            System.out.println(ans);
            return 1;
        }

        if(sum_till_now > target){
            return 0;
        }

        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            count += choices_upto_target(target , n , sum_till_now+i , ans + i + " ");
        }

        return count;
    }
}
