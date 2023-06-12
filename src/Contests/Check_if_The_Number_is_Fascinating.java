package Contests;
import java.util.*;

public class Check_if_The_Number_is_Fascinating {
    public static void main(String[] args) {
        int n = 783;
        int num1 = n*2;
        int num2= n*3;
        String s=String.valueOf(n);
        String str = s+num1+num2;
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>1){
//                return false;
                System.out.println(false);
                return;
            }
        }
//        System.out.println(typeof(str));
        for(int i=1;i<10;i++){
            Boolean flag = false;
            for(int j=0;j<str.length();j++){
                String str2=String.valueOf(i);
                if(str2.charAt(0)==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(false);
                return;
            }
        }


        System.out.println(true);

    }
}
