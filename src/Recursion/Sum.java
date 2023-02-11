package Recursion;

public class Sum {
    public static void main(String[] args) {
        int n=5;
        print(n);

    }
    static void print(int n){
        if(n==0){
            return ;
        }
        print(--n);
        System.out.println(n);

    }
}
