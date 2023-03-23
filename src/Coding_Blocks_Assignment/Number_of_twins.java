package Coding_Blocks_Assignment;
import java.util.*;

public class Number_of_twins {
    public static void main(String[] args) {
        String str="AXAXA";
        Counting_Twins(str);
//        return count;
        System.out.println(count);
    }
    static int count=0;
    static void Counting_Twins(String str){
        if(str.isEmpty()){
            return;
        }
//        for(int i=0;i<str.length();i++){
            if(str.charAt(0)==str.charAt(2)){
                Counting_Twins(str.substring(2));
                count++;
            }
            if(str.charAt(1)==str.charAt(3)){
                Counting_Twins(str.substring(3));
                count++;

            }
//        }
    }
}
