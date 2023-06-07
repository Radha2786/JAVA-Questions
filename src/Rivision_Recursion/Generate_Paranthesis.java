package Rivision_Recursion;

public class Generate_Paranthesis {
    public static void main(String[] args) {
        int n =3;
        int opening=n;
        int closing=n;
        GenerateParanthesis(opening , closing,"");
    }
    public static void GenerateParanthesis(int opening, int closing ,String str){
        // call for opening
        if(opening==0 && closing==0){
            System.out.println(str);
            return;
        }
        if(opening<0 || closing<0){
            return;
        }
        GenerateParanthesis(opening-1,closing,str+'(');
        if(opening<closing){
            GenerateParanthesis(opening,closing-1,str+')');
        }

    }
}
