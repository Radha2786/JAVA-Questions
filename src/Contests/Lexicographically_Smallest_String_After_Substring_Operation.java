package Contests;
import java.util.*;
public class Lexicographically_Smallest_String_After_Substring_Operation {
    public static void main(String[] args) {

        String st="aaabca";


        char[] arr = st.toCharArray();
        int s = 0;
        int e = 0;
        boolean flag = false;
        for(int i = 0; i < st.length() ; i++){
//            if(arr[i] == 'a'){
//                continue;
//            }

            while (i < st.length() && st.charAt(i) != 'a'){
                arr[i] = (char) (arr[i] - 1);
                flag = true;
                i++;
            }

            break;
        }
        if(!flag){
            arr[arr.length-1] = 'z';
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < arr.length ; i++){
            builder.append(arr[i]);
        }

//        return builder.toString();
        System.out.println( builder.toString());
    }
}