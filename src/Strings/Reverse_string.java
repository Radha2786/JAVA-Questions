package Strings;

public class Reverse_string {
    public static void main(String[] args) {
        String s = "0P";
        String str="";
        String ans="";
//        for(int i=s.length()-1;i>=0;i--){
//            str=str+s.charAt(i);
//
//        }
//        System.out.println(str);

        //Pallindrome

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                 ch= (char)(ch+32);
                str=str+ch;
            }else if(ch>=97 && ch<=122){
                str=str+ch;
            }
        }
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            ans=ans+ch;
        }
        if(str.equals(ans)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
//        System.out.println(str);
    }

