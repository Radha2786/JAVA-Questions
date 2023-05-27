package Contests;
import java.util.*;

public class Extra_Characters_in_a_String {
    public static void main(String[] args) {
        String str = "sayhelloworld";
        String str2="";
        String str3="";
        String[] dictionary = {"hello","world"};
        int k=0;
        while(k<str.length()) {


            for (int i = k; i < str.length(); i++) {
                str2 += str.charAt(i);
                for (int j = 0; j < dictionary.length; j++) {
                    if (dictionary[j].equals(str2)) {
                        str3 += str.charAt(i + 1);

                    } else {
                        str3+=str.charAt(i);
//                        continue;
                    }

                }
            }
            k++;
        }
        System.out.println(str3.length());
    }
}
