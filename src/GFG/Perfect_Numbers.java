package GFG;

public class Perfect_Numbers {
    public static void main(String[] args) {
        long N = 6;
        System.out.println(isPerfectNumber(N));
    }
    static int isPerfectNumber(long N) {
        // code here
        int sum=0;
        for(int i=1;i<Math.sqrt(N);i++){
            if(N%i==0){
                sum=sum+i;
            }
        }
        if(sum==N){
            return 1;
        }
        return 0;
    }
}
