package Rivision_Recursion;
import java.util.*;
public class Boardpath_cb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
        int n = 3;
        int faces =3;
        Print_Valid_Path(n,faces,"");
        System.out.println();
        System.out.println(count);

    }
    static int count=0;
    public static void Print_Valid_Path(int n , int faces, String ans){
        if(n==0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(n<0){
            return;
        }
        for(int i=1;i<=faces;i++){
            Print_Valid_Path(n-i,faces,ans+i);
        }
    }
}
