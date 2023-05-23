package Strings;

public class Strings_Difference_in_Ascii_Codes {
    public static void main(String[] args) {
        String str="acb";
        for(int i=0 ; i<str.length()-1 ; i++){
            int n =str.charAt(i+1)-str.charAt(i);
            System.out.print(str.charAt(i)+""+n);

        }
        int m = str.length()-1;
//        char ch=(char)str.charAt(str.charAt(m));
        System.out.println(str.charAt(m));
    }
}
