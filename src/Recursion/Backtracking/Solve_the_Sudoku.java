package Recursion.Backtracking;

public class Solve_the_Sudoku {
    public static void main(String[] args) {
//        int board[][] =
//        {{3, 0, 6, 5, 0, 8, 4, 0, 0},
//            {5 ,2 ,0 ,0 ,0 ,0 ,0 ,0 ,0},
//            {0 ,8, 7, 0, 0, 0, 0, 3, 1 },
//            {0 ,0, 3, 0, 1, 0, 0, 8, 0},
//            {9 ,0, 0, 8, 6, 3, 0, 0, 5},
//            {0, 5, 0, 0, 9, 0, 6, 0, 0},
//            {1 ,3, 0, 0, 0, 0, 2, 5, 0},
//            {0, 0, 0, 0, 0, 0, 0, 7, 4},
//            {0, 0, 5, 2, 0, 6, 3, 0, 0}};
    }

    static boolean SolveSudoku(int board[][])
    {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == 0){
                    for(int choice = 1 ; choice <= 9 ; choice++){
                        if(isSafe(board , i , j , choice)){
                            board[i][j] = choice;

                            boolean flag = SolveSudoku(board);

                            if(flag){
                                return true;
                            }
                            else{
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }

        return true;


    }

    static boolean isSafe(int[][] board , int r , int c , int num){
        // CHECK ROW - WISE
        for(int i = 0 ; i < board.length ; i++){
            if(board[i][c] == num){
                return false;
            }
        }

        // CHECK COL - WISE
        for(int i = 0 ; i < board.length ; i++){
            if(board[r][i] == num){
                return false;
            }
        }

        // CHECK GRID
        int size = (int) Math.sqrt(board.length);

        int sr = r - (r % size);
        int sc = c - (c % size);

        for(int i = sr ; i < sr + size ; i++){
            for(int j = sc ; j < sc + size ; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }


        return true;

    }

    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for(int i = 0 ; i < grid.length ; i++){

            for(int j = 0 ; j < grid[0].length ; j++){

                System.out.print(grid[i][j] + " ");
            }

             System.out.println();
        }
    }
}
