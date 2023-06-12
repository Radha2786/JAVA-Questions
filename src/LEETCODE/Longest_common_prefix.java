package LEETCODE;
import java.util.*;

public class Longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        if(strs.length==1){
////            return "";
//            System.out.println("");
//        }
//        int i=0;
//        char ch = strs[0].charAt(i);
//        String str="";
//        str=str+ch;
//        for(int j=1;j<strs.length;j++){
//            char ch2=strs[j].charAt(i);
//            String str2="";
//            str2=str2+ch2;
//            if(str.equals(str2)){
//                i++;
//
//                str+=strs[0].charAt(i);
//            }else{
////                return "";
//                System.out.println("");
//                break;
//            }
//        }
//        return str;
//        System.out.println(str);

        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String ans="";
        int i=0;
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        while(str1.charAt(i)==str2.charAt(i)){
            ans+=str1.charAt(i);
            i++;
        }
        System.out.println(ans);
    }
}
