package Recursion;

public class Remove_char {
    public static void main(String[] args) {
        String st="baabb";
        String ans="";
        remove_char(st,ans);
    }

    static void remove_char(String st,String ans){
        if(st.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=st.charAt(0);
        if(ch == 'a'){
            remove_char(st.substring(1),ans);
        }else{
            remove_char(st.substring(1),ans+ch);
        }
    }
}
