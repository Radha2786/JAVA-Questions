package Recursion;

public class Reverse_number {
    public static void main(String[] args) {
        int n=123;
       int sum = reverse(n,0);
        System.out.println(sum);
    }
    static int reverse(int n,int sum){
        if(n==0){
//            System.out.println(sum);
            return sum;
        }
        int rem=n%10;
        sum=(sum*10)+rem;
        return reverse(n/10,sum);
    }
}


//-------->ANOTHER WAY

//
//public class Reverse_number {
//    public static void main(String[] args) {
//        int n=123;
//         reverse(n,0);
//    }
//    static void reverse(int n,int sum){
//        if(n==0){
////            System.out.println(sum);
//            System.out.println(sum);
//            return;
//        }
//        int rem=n%10;
//        sum=(sum*10)+rem;
//        reverse(n/10,sum);
//    }
//}
