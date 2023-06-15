package Contests;

public class solution
{
    public static void main(String[] args) {
String s="52233";
        int n = s.length();
        int i = 0,j=0;
        int len =0;
        while( j < n )
        {
            if(check(s.substring(i,j+1)) == true)          // window is valid
            {
                len = Math.max(len,j-i+1);
                j++;
            }
            else         // if invalid
            {
                i++;
            }
        }
//        return len;
        System.out.println(len);
    }
    // Function to check weather the string is semi-repetitive or not
    public static boolean check(String str)
    {
        int cnt =0;
        for(int i = 0; i < str.length()-1;i++)
        {
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
        }
        if(cnt <= 1) return true;
        else return false;

    }
}
