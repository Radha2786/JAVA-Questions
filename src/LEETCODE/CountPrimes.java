package LEETCODE;

public class CountPrimes {
    public static void main(String[] args) {

    }

    static int countPrimes(int n) {
        return 1;
    }

    static boolean isPrime(int n){

//        o(n)
//        for(int i = 2 ; i < n ; i++){
//            if(n % i == 0){
//                return false;
//            }
//        }

//        o(n/2) => o(n)
//        for(int i = 2 ; i < n/2 ; i++){
//            if(n % i == 0){
//                return false;
//            }
//        }

//        o(√n)
        for(int i = 2 ; i * i <= n ; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    static int primeSeives(int n){
        boolean[] arr = new boolean[n+1];
        arr[0] = arr[1] = true;
        for(int i = 2;i*i<=n;i++){
            if(arr[2]=false){
                for(int j=2;i*j<=n;j++){
                    arr[j*i]=true;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == false){
                count++;
            }
        }
//        System.out.println(count);
        return count;
    }


}
