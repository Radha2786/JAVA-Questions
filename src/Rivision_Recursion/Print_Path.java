package Rivision_Recursion;

import java.util.ArrayList;

public class Print_Path {
    public static void main(String[] args) {
        int m =3;
        int n =3;
        ArrayList<String> list = new ArrayList<>();
        Path(m-1,n-1,0,0,0,"",list);
        System.out.println(list);
        System.out.println(count);

        }
        static int count=0;

        public static void Path(int ec,int er, int cr,int cc,int diagonal,String ans, ArrayList<String> list){
        if(cr>er || cc>ec || diagonal>er || diagonal>ec){
            return;
        }
        if(cr==er && cc==ec){
            list.add(ans);
            count++;
//            System.out.println(ans);
            return;
        }
//        call for horizontal path
            Path(ec,er,cr,cc+1,diagonal,ans+'H',list);
            // call for vertical path
            Path(ec,er,cr+1,cc,diagonal,ans+'V',list);
            // call for diagonal
            Path(ec,er,cr+1,cc+1,diagonal+1,ans+'D',list);


        }

}
