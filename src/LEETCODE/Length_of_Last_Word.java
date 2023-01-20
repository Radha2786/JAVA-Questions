package LEETCODE;
import java.util.Arrays;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "Hello   World";
        String[] arr = s.split("\s+");
        System.out.println(Arrays.toString(arr));
    }
}
