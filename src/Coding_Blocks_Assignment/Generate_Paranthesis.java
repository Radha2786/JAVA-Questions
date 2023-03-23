package Coding_Blocks_Assignment;
import java.awt.image.renderable.ParameterBlock;
import java.util.*;

public class Generate_Paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Paranthesis(n,n,"");
    }
    static void Paranthesis(int open_bracket,int closing_bracket,String ans){
        if(open_bracket==0 && closing_bracket==0){
            System.out.println(ans);
            return;
        }
        if(open_bracket!=0){
            Paranthesis(open_bracket-1,closing_bracket,ans+'(');
        }

        if(open_bracket<closing_bracket){
            Paranthesis(open_bracket,closing_bracket-1,ans+')');

        }

    }
}
