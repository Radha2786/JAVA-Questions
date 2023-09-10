package Rivision_Recursion.Path;

public class Generate_Paranthesis {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
        GenerateParanthesis(3,0,0,"");
    }
    public static void GenerateParanthesis(int n,int opening,int closing,String str){
        if(opening==n && closing==n){
            System.out.println(str);
            return;
        }
        if(opening>n){
            return;
        }
        if( closing>n){
            return;
        }
        // opening call
        GenerateParanthesis(n,opening+1,closing,str+"(");
        // closing call
        GenerateParanthesis(n,opening,closing+1,str+")");
    }

}
