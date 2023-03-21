package Recursion.MAZE_PROBLEMS;

public class WordSearch_79 {
    public static void main(String[] args) {
        char[][] board = {{'A' , 'B' ,'C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = search(board , i , j , word);
                    if(ans){
                        System.out.println("WORD FOUND");
                        return;
                    }
                }
            }
        }
    }

    static boolean search(char[][] board , int r , int c , String st){
        if(st.length() == 0){
            return true;
        }

//        2ND BASE CONDITION
        if(r < 0 || r == board.length || c < 0 || c == board[0].length || board[r][c] == '*' || board[r][c] != st.charAt(0)){
            return false;
        }

        char ch = board[r][c];

//        VISITED
        board[r][c] = '*';

//        move up
        if(search(board , r-1 , c , st.substring(1))){
            return true;
        }

//        move down
        if(search(board , r+1 , c , st.substring(1))){
            return true;
        }

//        move left
        if(search(board , r , c-1 , st.substring(1))){
            return true;
        }

//        move right
        if(search(board , r , c+1 , st.substring(1))){
            return true;
        }

//        UNVISITED
        board[r][c] = ch;

        return false;
    }

}
