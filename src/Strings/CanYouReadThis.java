package Strings;

public class CanYouReadThis {
    public static void main(String[] args) {
        String str="IAmACompetitiveProgrammer";
        int s=0,e=0;
        while(e<str.length()-1){
            e++;
            if(str.charAt(e)>=65 && str.charAt(e)<=90){
                String str2=str.substring(s,e);
                System.out.println(str2);
                s=e;

            }
        }
        System.out.println(str.substring(s));
    }
}
