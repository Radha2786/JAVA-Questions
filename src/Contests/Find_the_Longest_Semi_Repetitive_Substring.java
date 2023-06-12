package Contests;
import java.util.*;

public class Find_the_Longest_Semi_Repetitive_Substring {
    public static void main(String[] args) {
        String s = "52233";
        String str="";
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    str=s.substring(0,j);
////                    break;
//                    System.out.println(str);
////                    return;
////                    break;
//                }
//
//            }
//            break;
//        }
        int index1=0;
        int index2=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    index1=i;
                    index2=j;
//                    break;
                }
            }

        }
        System.out.println(index1);
        System.out.println(index2);
//        System.out.println(s.substring(index1,index2+1));
        String ans= s.substring(index1,index2+1);
//        return ans.length();
        System.out.println(ans.length());
    }
}
