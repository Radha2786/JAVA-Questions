package Strings;

public class Print_last_character_of_each_word_in_a_string {
    public static void main(String[] args) {
        String S = "computer applications";

        System.out.println(LastCharacter(S));
    }
    static String LastCharacter(String S){
//        char ch=S.charAt(0);
        String new_str="";
//        new_str+=ch;
        int p1=1;
        int p2=2;
        while(p2<S.length()){
            p2=p1+1;
            if(S.charAt(p1)==' ' && S.charAt(p2)!=' '){
                new_str+= S.charAt(p1-1);
                new_str+=' ';
//                new_str+= S.charAt(p2);
            }
            p1++;
        }
        char a=S.charAt(S.length()-1);
        new_str+=a ;


        return new_str;

    }
}
