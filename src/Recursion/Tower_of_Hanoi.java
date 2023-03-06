package Recursion;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        int n = 3;
        tower_of_hanoi(n , "source" , "helper" , "destination");
    }

    static void tower_of_hanoi(int n , String source , String helper , String destination){

        // BASE CONDITION
        if(n == 0){
            return;
        }

        // PUTTING (n-1) disk from source to helper
        tower_of_hanoi(n-1 , source , destination , helper);


        // PUTTING LAST DISK FROM SOURCE TO DESTINATION
        System.out.println("Pick disk " + n + " from " + source + " to " + destination);

        // PUTTING (n-1) disk from helper to source
        tower_of_hanoi(n-1 , helper , source , destination);
    }
}
