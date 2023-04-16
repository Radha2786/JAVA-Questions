package LEETCODE;
import java.util.*;

public class Optimal_Partition_of_String {
    public static void main(String[] args) {
        String s = "ssssss";
        int n =Partitioning_String(0,s,"");
//        System.out.println(count);
//        return n;
        System.out.println(n);

    }
//    static int count = 0;
    static int Partitioning_String(int count,String question , String  ans){
        if(question.isEmpty()){
            count++;
            return count;
        }
//        String s = question.substring(index);
        char s = question.charAt(0);
        boolean flag=false;
        for(int i=0;i<ans.length(); i++){
            if(s==ans.charAt(i)){
                count++;
                ans="";
                flag=true;
                break;
            }
        }
        if(flag){
            return Partitioning_String(count,question.substring(1),ans+question.charAt(0));
        }else{
            return Partitioning_String(count,question.substring(1),ans+question.charAt(0));
        }
//        index++;
//        Partitioning_String(index=index+1,question.substring(index+1),ans+question.charAt(index));

    }
}
