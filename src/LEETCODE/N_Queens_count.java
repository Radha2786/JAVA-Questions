package LEETCODE;

public class N_Queens_count {
    public static void main(String[] args) {
        int t = 5;
        while (t-- > 0){
            int n = t;
            boolean[][] Board = new boolean[n][n];
            placeQueens(Board , 0 , 0);
//        return count;
            System.out.println("ans for " + n + " " + count);
        }
    }
    static int count = 0;
    static void placeQueens(boolean[][] Board, int row , int queensplacedsofar ){
        if(queensplacedsofar == Board.length){
            count++;
            // list.add(construct(Board,list));
            return ;
        }
        for(int col=0 ; col< Board.length ; col++){
            if(IsSafe(Board,row,col)){
                Board[row][col]=true;
                placeQueens(Board , row+1, queensplacedsofar+1);
                Board[row][col]=false;
            }
        }
    }
    static boolean IsSafe(boolean[][] Board,int row, int col){
        // upside
        for(int r=row-1 ; r>=0 ; r--){
            if(Board[r][col]){
                return false;
            }
        }

        //        left diagonal
        for(int r=row-1 , c=col-1 ; r>=0 && c>=0 ; r--,c--){
            if(Board[r][c]){
                return false;
            }
        }

        for(int r=row-1 , c=col+1 ; r>=0 && c<Board[0].length ; r-- , c++){
            if(Board[r][c]){
                return false;
            }
        }
        return true;
    }
}
