package Recursion;

public class Pallindrome_String {
    public static void main(String[] args) {
//        String str="aba";
//        String ans="";
//        int i=str.length()-1;
//        Is_Pallindrome(str,ans,i);

        String st = "aabaaa";
        System.out.println(isPalin(st , 0 , st.length()-1));

    }
//    static void Is_Pallindrome(String str,String ans,int i){
//        if(i==-1){
//            if(str.equals(ans)){
//                System.out.println(true);
//
//            }else{
//                System.out.println(false);
//
//            }
//            return;
//        }
//        ans=ans+str.charAt(i);
//        Is_Pallindrome(str,ans,i-1);
//
//    }

    static boolean isPalin(String str , int s , int e){
        if(s >= e){
           return true;
        }
//a a a b b b a a a
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }

        return isPalin(str , s+1 , e-1);

    }

}
