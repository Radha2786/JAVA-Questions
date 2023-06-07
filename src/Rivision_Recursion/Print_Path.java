package Rivision_Recursion;

public class Print_Path {
    public static void main(String[] args) {
        int m =3;
        int n =3;
        Path(m-1,n-1,0,0,"");

        }
        public static void Path(int ec,int er, int cr,int cc,String ans ){
        if(cr>er || cc>ec){
            return;
        }
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
//        call for horizontal path
            Path(ec,er,cr,cc+1,ans+'H');
            // call for vertical path
            Path(ec,er,cr+1,cc,ans+'V');


        }

}
