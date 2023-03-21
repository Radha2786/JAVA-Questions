package Recursion.Backtracking;

import java.util.ArrayList;

public class Partition_practice {
    public static void main(String[] args) {
        String question = "Radha";
        Partition(question,"");
    }
    static void Partition(String question,String answer){
        if(question.isEmpty()){
            System.out.println(answer);
            return ;
        }
        for(int i=1;i<=question.length();i++){
            String p = question.substring(0,i);
            Partition(question.substring(i),answer+" " + p);
        }


    }
}
