package Recursion.MAZE_PROBLEMS;

public class Move_V_and_H {
    public static void main(String[] args) {
//        boolean[][] board = new boolean[4][4];

//        paths(board , 0 , 0 , "");

        int total_paths = countPaths(4 , 0 , 0 , "");
        System.out.println(total_paths);
    }

    static void paths(int board_length , int current_row , int current_col , String ans){
        if(current_row == board_length-1 && current_col == board_length-1){
            System.out.println(ans);
            return;
        }

        if(current_row == board_length || current_col == board_length){
            return;
        }

//        MOVE VERTICALLY
        paths(board_length, current_row+1 , current_col , ans + "V");

//        MOVE HORIZONTALLY
        paths(board_length , current_row , current_col + 1  , ans + "H");

    }

    static int countPaths(int board_length , int current_row , int current_col , String ans){
        if(current_row == board_length-1 && current_col == board_length-1){
            System.out.println(ans);
            return 1;
        }

        if(current_row == board_length || current_col == board_length){
            return 0;
        }

        int count = 0;
//        MOVE VERTICALLY
       count +=  countPaths(board_length , current_row+1 , current_col , ans + "V");

//        MOVE HORIZONTALLY
       count += countPaths(board_length , current_row , current_col + 1  , ans + "H");

       return count;
    }
}
