package Recursion;

import java.util.ArrayList;

public class Lexicographically_counting {
    public static void main(String[] args) {
        int n = 1000;
        ArrayList<Integer> list = new ArrayList<>();
        lexicographicalCounting(n , 0 , list);
        System.out.println(list);
    }

    static void lexicographicalCounting(int n , int ans , ArrayList<Integer> list){
        // BASE CONDITION
        if(ans > n){
            return;
        }

        if(ans != 0){
//            System.out.println(ans);
            list.add(ans);
        }

        int choose = 0;

        if(ans == 0){
            choose = 1;
        }

        while(choose <= 9){
            lexicographicalCounting(n , ans*10 + choose , list);
            choose++;
        }

    }
}
