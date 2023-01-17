package Strings;

public class Print_every_word_in_next_line {
    public static void main(String[] args) {
        String str = "hello everyone  this is";
//        String new_str="";

//        for(int i=0;i < str.length();i++){
//            char ch = str.charAt(i);
//            char c = str.charAt(str.length()-1);
//            if(ch == ' ' ){
//                System.out.println(new_str);
//                new_str="";
//            } else{
//                new_str += ch;
//            }
//        }
//        System.out.println(new_str);


        int s=0;
        int e=0;
        String new_str="";
        while(e<str.length()){
            if(str.charAt(e)==' '){
                System.out.println(str.substring(s,e));
                e++;
                s=e;
            }else{
                e++;
            }

        }
    }
}
