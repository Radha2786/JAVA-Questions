package Recursion.MAZE_PROBLEMS;

import java.util.ArrayList;

public class Rat_in_a_Maze_Problem {
    public static void main(String[] args) {
       int[][] board = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};

       ArrayList<String> list = new ArrayList<>();

       maze(board , 0 , 0 , list , "");

        System.out.println(list);
    }

    static void maze(int[][] board , int r , int c , ArrayList<String> list , String ans){

//        BASE CONDITION
        if(r == board.length-1 && c == board.length-1){
            list.add(ans);
            return;
        }

//          2ND BASE CONDITION
        if(r < 0 || r == board.length || c < 0 || c  == board.length || board[r][c] == 0){
            return;
        }
//
////        visited
//        board[r][c] = 0;
//
////        MOVE DOWN
//        maze(board , r+1 , c , list , ans+'D');
//
////        MOVE UP
//        maze(board , r-1 , c , list , ans+'U');
//
////        MOVE RIGHT
//        maze(board , r , c + 1 , list , ans+'R');
//
////        MOVE LEFT
//        maze(board , r , c-1 , list , ans+'L');
//
////        unvisited
//        board[r][c] = 1;

    }
}
