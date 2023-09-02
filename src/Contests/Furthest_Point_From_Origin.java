package Contests;
import java.util.*;

// Wrong hai

public class Furthest_Point_From_Origin {
    public static void main(String[] args) {
        String str = "_R__LL_";
        int LeftCount=0,RightCount=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L'){
                LeftCount++;
        }else if(str.charAt(i)=='R'){
            RightCount++;
        }else{
                LeftCount++;
                RightCount++;
            }
    }
    System.out.println(Math.abs(LeftCount-RightCount));
    }
}
