package Strings;

public class Combine_the_strings {
    public static void main(String[] args) {
        String[] s = {"RRR", "BBB"};
        String str=s[0];
        for(int i=1;i<s.length;i++){
            if(str.charAt(str.length()-1)==s[i].charAt(0)){
                str=str+s[i];
            }
        }
        if(str.length() == s[0].length() ){
            System.out.println(0);
        }
        System.out.println(str.length());
    }
}
