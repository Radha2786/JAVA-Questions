package Coding_Blocks_Assignment;

import java.util.*;

public class Maze_path_Count_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        Paths(rows,columns,0,0,list,"");
        System.out.println(list);
//        System.out.println();
//        System.out.println(answer);
        System.out.println(count);

    }
    static int count=0;
    static void Paths(int rows,int columns,int cr,int cc, ArrayList<String> list,String ans){
//        int count=0;
        if(cr==rows-1 && cc== columns-1){
            list.add(ans);
            count++;
            return;
//            return 1;

        }
        if(cr==rows || cc == columns){
//            return 0;
            return;
        }
        Paths(rows,columns,cr+1,cc,list,ans+'V');
        Paths(rows,columns,cr,cc+1,list,ans+'H');
//        return count;

    }
}
