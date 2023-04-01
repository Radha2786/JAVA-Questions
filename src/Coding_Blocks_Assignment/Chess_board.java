package Coding_Blocks_Assignment;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Chess_board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Board(n, 0, 0, "");
        System.out.println();
        System.out.println(count);
    }
    static int count =0;
    static void Board(int n , int cr , int cc , String ans){
        if(cc==n-1 && cr==n-1){
            System.out.print(ans+'{'+cr+'-'+cc+'}'+" ");
            count++;
            return ;
        }
        if(cr>=n || cc>=n ){
            return ;
        }

//        call for knight
        //  down right
        Board(n,cr+2,cc+1,ans+'{'+cr+'-'+cc+'}' + 'K');
//        right down
        Board(n,cr+1,cc+2,ans+'{'+cr+'-'+cc+'}' + 'K');

        // call for Rook

        if(cr==0 || cr==n-1 || cc==0 || cc==n-1) {
            //Right
            int choices = (n - 1) - cc;
            for (int i = 1; i <= choices; i++) {
                Board(n, cr, cc + i, ans+'{'+cr+'-'+cc+'}' + 'R');
            }
            // Down
            choices = (n - 1) - cr;
            for (int i = 1; i <= choices; i++) {
                Board(n, cr + i, cc, ans+'{'+cr+'-'+cc+'}' + 'R');
            }
        }
//        call of Bishop
        // right down diagonal
        if(cc==cr || cc +cr==n-1){
            for(int i=1;i<n;i++){
                Board(n,cc+i,cr+i,ans+'{'+cr+'-'+cc+'}' + 'B');
            }

        }

    }
}

