import java.util.Scanner;
import java.lang.*;
public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        System.out.println(sum(num));

    }

    static int sum(int num){
        int n=1;
        int sum=0;
        while(n<=num){
            sum=sum+n;
        }
        return sum;
    }
}

