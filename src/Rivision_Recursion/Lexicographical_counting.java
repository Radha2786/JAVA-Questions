package Rivision_Recursion;

public interface Lexicographical_counting {
    public static void main(String[] args) {
        int n = 13;
        printCount(n,0);

    }
    public static void printCount(int end , int current){
        if(current>end){
            return;
        }
        if(current!=0) {


            System.out.println(current);
        }
        int i=0;
        if(current==0){
            i=1;
        }
        for(;i<=9;i++){
            printCount(end,current*10+i);
        }
    }
}
