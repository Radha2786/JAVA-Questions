package Coding_Blocks_Assignment;

public class Recursion_Twins {
    public static void main(String[] args) {
        String str= "AXAXA";
        Twins_Count(str);
//        return ans;
        System.out.println(count);
    }
    static int count;
    static void Twins_Count(String str){
       if(str.length()==2){
           return ;
//           return count;
       }
       if(str.charAt(0)==str.charAt(0+2)){
           count++;
//           return 0;
       }
       Twins_Count(str.substring(1));
//       return count ;

    }
}
