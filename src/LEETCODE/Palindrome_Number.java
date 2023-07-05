package LEETCODE;

public class Palindrome_Number {
    public static void main(String[] args) {
        int x = 10;
        int ans = 0;
        if (x < 0) {
//            return false;
            System.out.println(false);
            return;
        } else {
            while (x > 0) {
                int a = x % 10;
                ans = ans * 10 + a;
                x = x / 10;
            }
            if (ans == x) {
//                 return true;
                System.out.println(true);
                return;
            } else {
//                 return false;
                System.out.println(false);
            }
        }
    }
}


