package LEETCODE;
import java.util.*;
public class Letter_Case_Permutation {
    public static void main(String[] args) {
        String str = "a1b2";
        ArrayList<String> list = new ArrayList();
        Letter_case(str,list,"");
//        return list;
        System.out.println(list);
    }
    static void Letter_case(String str,ArrayList<String> list,String ans){
        if(str.isEmpty()){
            list.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90  || ch >=97 && ch<=122){
                if(ch>=97 && ch<=122){
                    char c=(char)(ch-32);
                    Letter_case(str.substring(i+1),list,ans + c);
                }else{
                    char c=(char)(ch-32);
                    Letter_case(str.substring(i+1),list,ans+c);
                }
//                Letter_case(str.substring(i+1),list,ans+ch);



            }
        }
    }

}
