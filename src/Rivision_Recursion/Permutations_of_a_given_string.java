package Rivision_Recursion;

import java.util.ArrayList;

public class Permutations_of_a_given_string {
    public static void main(String[] args) {
        String S="ABB";
        ArrayList<String> list = new ArrayList<>();
        find_permutation(S,"",list);
        System.out.println(list);
    }
    public static void find_permutation(String S,String ans,ArrayList<String> list){
        if(S.isEmpty()){
            list.add(ans);
            return;
        }
        for(int i=0;i<S.length();i++){
            Boolean flag = false;
            for(int j=i+1;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false) {
                String prefix = S.substring(0, i);
                String suffix = S.substring(i + 1);
                find_permutation(prefix + suffix, ans + S.charAt(i), list);
            }

        }
    }
}
