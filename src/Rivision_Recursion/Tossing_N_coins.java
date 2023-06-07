package Rivision_Recursion;

public class Tossing_N_coins {
    public static void main(String[] args) {
        int N = 3;
//        Tossing_Coins(N,"");
        Tossing_Coins2(N,"");
    }
    public static void Tossing_Coins(int N,String str){
        if(N==0){
            System.out.println(str);
            return ;
        }
            Tossing_Coins(N-1,str+'H');

        Tossing_Coins(N-1,str+'T');
    }

    // two consecutive heads should not come
    public static void Tossing_Coins2(int N, String ans){
        if(N==0){
            System.out.println(ans);
            return ;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
            Tossing_Coins2(N - 1, ans + 'H');
        }
        Tossing_Coins2(N-1,ans+'T');

    }

}
