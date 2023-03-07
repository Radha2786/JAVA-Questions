package Recursion.Backtracking;

public class Place_Queens_on_a_single_box_combinations {
    public static void main(String[] args) {
        boolean[] board = new boolean[4];
        placeQueens(board , 2 , 0 , "" , 0);
    }
    static void placeQueens(boolean[] board , int queens  , int queen_placed_so_far, String ans , int index){
        if(queen_placed_so_far == queens){
            System.out.println(ans);
            return;
        }

        for(int i = index ; i < board.length ; i++){
            if(board[i] == false){

//                PUTTING QUEEN AT THAT POSITION
                board[i] = true;

                placeQueens(board , queens , queen_placed_so_far+1 , ans + "Queen" + queen_placed_so_far + "Box" + i ,
                        index + 1);

                // UNDOING CHANGES
                board[i] = false;
            }
        }
    }
}
