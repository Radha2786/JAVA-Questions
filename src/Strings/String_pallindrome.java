package Strings;

public class String_pallindrome {
    public static void main(String[] args) {
        String S = "abba";
        String A="";
        int l =S.length()-1;
        for(int i=l;i>=0;i--){
             A += S.charAt(i);
        }
//        System.out.println(A);
        if(S.equals(A)){
            System.out.println("is pallindrome");
        } else{
            System.out.println("not");
        }
    }
}
