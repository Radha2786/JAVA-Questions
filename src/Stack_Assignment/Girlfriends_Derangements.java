package Stack_Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Girlfriends_Derangements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            arr.add(i);
        }

        System.out.println(valid_deraangements(arr , new ArrayList<>()));
    }


    static int valid_deraangements(List<Integer> question , List<Integer> ans){
        if(question.size() == 0){

            for (int i = 0 ; i < ans.size() ; i++){
                if(i == ans.get(i)){
                    return 0;
                }
            }

            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int i = 0 ; i < question.size() ; i++){
            int data = question.remove(i);
            ans.add(data);

//            COUNT THE ANSWERS
            count += valid_deraangements(question , ans);

//            BACKTRACK
            ans.remove(ans.size()-1);
            question.add(i , data);
        }

        return count;
    }
}
