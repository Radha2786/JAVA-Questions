package Rivision_Recursion;

public class Possible_Path_to_reach_destination {
    public static void main(String[] args) {
        int target=4;
//        System.out.println("\n"+ ways_to_reach(4,""));
        System.out.println("\n"+ways_to_reach2(target,0,""));
    }
    public static int ways_to_reach(int n,String ans){
        if(n==0 ){
            System.out.println(ans);
            return 1;
        }
        if(n<0){
            return 0;
        }
        int ans1=ways_to_reach(n-1,ans+'1');
        int ans2=ways_to_reach(n-2,ans+'2');
        int ans3=ways_to_reach(n-3,ans+'3');
        return ans1+ans2+ans3;

//        for more than 2-3 recursive calls

    }
//    static int count=0;
    public static int ways_to_reach2(int n, int current, String ans){
        if(current==n ){
            System.out.println(ans);
            return 1;
        }
        if(current>4){
            return 0;
        }
        int count =0;

        for(int dice = 1;dice<=3 ;dice++){
            count+=ways_to_reach2(n,current+dice ,ans+dice );
        }
        return count;

    }

}
