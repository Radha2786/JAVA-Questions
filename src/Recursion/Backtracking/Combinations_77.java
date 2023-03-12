package Recursion.Backtracking;

import java.util.ArrayList;

public class Combinations_77 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        combinations(4 , 2 , 0 , 1 , ll , list);
        System.out.println(ll);
    }

    static void combinations(int n , int k , int placed , int index , ArrayList<ArrayList<Integer>> ll , ArrayList<Integer> list){
        if(placed == k){
            ll.add(new ArrayList<>(list));
            return;
        }

        for (int i = index ; i <= n ; i++){

            list.add(i);

            combinations(n ,k , placed+1 , i+1 , ll ,list);

            list.remove(list.size()-1);
        }
    }
}
