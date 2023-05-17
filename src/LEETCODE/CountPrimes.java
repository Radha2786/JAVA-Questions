package LEETCODE;

public class CountPrimes {
    public static void main(String[] args) {

    }

    static int countPrimes(int n) {

    }

    static boolean isPrime(int n){

//        o(n)
//        for(int i = 2 ; i < n ; i++){
//            if(n % i == 0){
//                return false;
//            }
//        }

//        o(n/2) => o(n)
        for(int i = 2 ; i < n/2 ; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
