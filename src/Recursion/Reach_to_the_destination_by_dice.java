package Recursion;

public class Reach_to_the_destination_by_dice {
    public static void main(String[] args) {
        int destination = 6;
        int dice_faces = 6;
        System.out.println(number_of_ways_to_reach_destination(destination , dice_faces , 0 ," "));
    }

    static int number_of_ways_to_reach_destination(int destination , int faces , int current_position , String ans){
        if(current_position == destination){
            System.out.println(ans);
            return 1;
        }

        if(current_position > destination){
            return 0;
        }
        int count = 0;
        for(int i = 1 ; i<=faces ; i++){
            count += number_of_ways_to_reach_destination(destination , faces , current_position+i , ans+i+" ");
        }

        return count;
    }
}
