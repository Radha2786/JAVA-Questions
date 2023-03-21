package Coding_Blocks_Assignment;

public class Mazepath_D {
    public static void main(String[] args) {
        System.out.println(Sum_Path(3,0,0,""));
    }
    static int Sum_Path(int row,int current_row,int current_col,String ans){
        int count=0;
        if(current_row == row-1 && current_col==row-1){
            System.out.println(ans);
            return 1;
        }
        if(current_row<0 || current_row == row || current_col==row || current_col<0){
            return 0;
        }
        // horizonatlly
        count+=Sum_Path(row,current_row+1,current_col,ans+'H');
//        vertically
        count+=Sum_Path(row,current_row,current_col+1,ans+'V');
//        diagonally
        count+=Sum_Path(row,current_row+1,current_col+1,ans+'D');
        return count;


    }
}
//    VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD