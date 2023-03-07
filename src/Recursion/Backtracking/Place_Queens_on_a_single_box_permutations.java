package Recursion.Backtracking;

public class Place_Queens_on_a_single_box_permutations {
    public static void main(String[] args) {
        boolean[] board = new boolean[4];
        placeQueens(board , 2 , 0 , "");
    }
    static void placeQueens(boolean[] board , int queens  , int queen_placed_so_far, String ans){
        if(queen_placed_so_far == queens){
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < board.length ; i++){
            if(!board[i]){
//                PUTTING QUEEN AT THAT POSITION
                board[i] = true;
                placeQueens(board , queens , queen_placed_so_far+1 , ans + "Queen" + queen_placed_so_far + "Box" + i);
//                UNDO CHANGES
                board[i] = false;

            }
        }
    }
}
