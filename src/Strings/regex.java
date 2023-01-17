package Strings;
import java.util.Arrays;

public class regex {
    public static void main(String[] args) {
        String s="the sky    is blue";
//        s = s.trim();
        String[] arr = s.split("\s+");
        System.out.println(Arrays.toString(arr));
    }
}
