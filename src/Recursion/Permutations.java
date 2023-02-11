package Recursion;

public class Permutations {
    public static void main(String[] args) {
        String st = "abc";
        permutations(st , "");
    }

    static void permutations(String st , String ans){
        if(st.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int i = 0 ; i < st.length() ; i++){
            String prefix = st.substring(0 , i);
            String surfix = st.substring(i+1);

            char ch = st.charAt(i);

            permutations(prefix+surfix , ans+ch);
        }
    }
}
