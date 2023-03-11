package Recursion.MAZE_PROBLEMS;

public class Move_Horizontaly_vertically {
    public static void main(String[] args) {
        int board_length = 4;
        String ans ="";
       int total_count=Total_path(board_length,0,0,ans);
        System.out.println(total_count);
    }
    static int  Total_path(int board_length,int current_row,int current_col, String ans){
        if(current_row==board_length-1 && current_col==board_length-1){
            System.out.println(ans);
            return 1;

        }
        if(current_row==board_length || current_col==board_length){
            return 0;

        }
        int count=0;
//        moving vertically
        count+=Total_path(board_length,current_row+1,current_col,ans+'V');
//        moving horizontally
        count+=Total_path(board_length,current_row,current_col+1,ans+'H');

        return count;
    }
}
