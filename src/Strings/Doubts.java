package Strings;

import java.util.*;
public class Doubts {
    public static void main(String[] args) {
//        String ans = "";
//        for(int i= 0 ; i < 65000 ; i++){
//            ans += 'i';
//        }
//        System.out.println(ans);

        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < 65000 ; i++){
            builder.append('i');
        }
        System.out.println(builder);
    }
}
