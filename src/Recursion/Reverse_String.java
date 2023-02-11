package Recursion;

public class Reverse_String {
    public static void main(String[] args) {
        String str="Radha";
        String str2="";
        int i=str.length()-1;
        Reverse(str,str2,i);

    }

    static void Reverse(String str,String str2,int i){
        if(i==-1){
            System.out.println(str2);
            return;
        }
        str2=str2+str.charAt(i);
        Reverse(str,str2,i-1);
    }
}
