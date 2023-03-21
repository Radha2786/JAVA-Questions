package Recursion.MAZE_PROBLEMS;

import java.util.Scanner;

public class CHESS_BOARD_KNIGHT_ROOK_BISHOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        board(n , 0 , 0 , "");
        System.out.println();
        System.out.println(count);
    }

//    {0-0}K {2-1}R{2-2}

    static int count = 0;
    static void board(int n , int cr , int cc , String ans){

//        BASE CONDITIONS

        if(cr == n-1 && cc == n-1){
            System.out.print(ans + '{'+cr+'-'+cc+'}'+ " " );
            count++;
            return;
        }

//        OUT OF BOND BASE CONDITIONS
        if(cr >= n || cc >= n){
            return;
        }

//        KNIGHT MOVES

//        KNIGHT DOWN

        board(n , cr+2 , cc+1 , ans+'{'+cr+'-'+cc+'}' + 'K');

//        KNIGHT RIGHT

        board(n , cr+1 , cc+2 ,ans+'{'+cr+'-'+cc+'}' + 'K');


//        ROOK -> SHOULD BE PRESENT AT EDGES
        if(cr == 0 || cr == n-1 || cc == 0 || cc == n-1){

//            ROOK RIGHT
            int number_of_choices = (n-1) - cc;
            for (int i = 1 ; i <= number_of_choices ; i++){
                board(n , cr , cc+i , ans+'{'+cr+'-'+cc+'}' + 'R');
            }

//            ROOK DOWN
           number_of_choices = (n-1) - cr;

            for (int i = 1 ; i <= number_of_choices ; i++){
                board(n , cr+i , cc , ans+'{'+cr+'-'+cc+'}' + 'R');
            }

        }


//        BISHOP -> SHOULD BE PRESENT AT DIAGONALS
        if(cr == cc || cr + cc == n-1){
            for(int i = 1 ; i < n ; i++){
                board(n , cr+i , cc+i , ans+'{'+cr+'-'+cc+'}' + 'B');
            }
        }


    }
}
