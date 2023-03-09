package LEETCODE;

public class First_Letter_to_Appear_Twice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        int[] frequency = new int[26];
        for(int i=0; i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
            if(frequency[s.charAt(i)-'a']==2){
                //  ch=s.charAt(i);
                System.out.println(s.charAt(i));
                return;

            }
        }
//        return 'a';
    }
}
