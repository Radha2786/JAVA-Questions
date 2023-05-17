package Strings;
import java.util.*;

public class Finding_CB_Numbers {
    public static void main(String[] args) {
        String str="81615";
        int count=0;
        for(int i=0;i<str.length();i++){
            String str1="";
            for(int j=i; j<str.length();j++){
//                char ch=str.charAt(j);
                 str1=str1+str.substring(j,j+1);
                int n=Integer.parseInt(str1);
                if(n!=0 && n!=1 && (n%2)!=0 && (n%3)!=0 && (n%4)!=0 && (n%5)!=0 && (n%6)!=0 && (n%7)!=0 && (n%8)!=0 && (n%9)!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
