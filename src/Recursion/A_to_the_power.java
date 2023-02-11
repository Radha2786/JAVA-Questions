package Recursion;

public class A_to_the_power {
    public static void main(String[] args) {
        int a=3,b=4;
        System.out.println( Power(a,b));
    }
    static int Power(int a,int b){
        if(b==0){
            return 1;
        }
        return a* Power(a,b-1);

    }
}
