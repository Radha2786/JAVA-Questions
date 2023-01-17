package Strings;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
       String[]  word1 = {"a", "cb"} ;
        String[] word2 = {"ab", "c"};
        String str="";
        String str2="";
        for(int i=0;i<word1.length;i++){
            str=str+word1[i];
        }
        System.out.println(str);
        for(int i=0;i<word2.length;i++){
            str2=str2+word1[i];
        }
        System.out.println(str2);
        if(str.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
