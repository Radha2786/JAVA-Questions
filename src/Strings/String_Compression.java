package Strings;
import java.util.*;

public class String_Compression {
    public static void main(String[] args) {
        String str ="aaabbccds";
       int count=0;
       int p1=0,p2=0;
       while(p2<str.length()){
           if(str.charAt(p1)==str.charAt(p2)){
               count++;
               p2++;
           }else{
               System.out.print(str.charAt(p1)+""+count);
               count=0;
               p1=p2;
           }
       }
        System.out.println(str.charAt(p2-1)+""+count);

    }
}
