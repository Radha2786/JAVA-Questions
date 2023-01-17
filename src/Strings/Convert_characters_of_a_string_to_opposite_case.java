package Strings;
/*

Given a string, convert the characters of the string into the opposite case,i.e. if a character is the lower case then convert it
into upper case and vice-versa.

Examples:

Input : geeksForgEeks
Output : GEEKSfORGeEKS

Input : hello every one
Output : HELLO EVERY ONE

*/
public class Convert_characters_of_a_string_to_opposite_case {
    public static void main(String[] args) {
        String str ="geeksForgEeks";
//        char ch;
//        int j=0;
//        int k=0;
//        for(int i=0;i<str.length();i++){
//            ch=str.charAt(i);
//             j =ch;
//             if(j>=97){
//                 k=j-32;
//                 System.out.print((char)(k));
//             }else{
//                 k=j+32;
//                 System.out.print((char)(k));
//             }
//        }
//        String str = "aA";
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= 97){
                System.out.print((char) (ch - 32));
            }else{
                System.out.print((char) (ch + 32));
            }
        }
    }
}
