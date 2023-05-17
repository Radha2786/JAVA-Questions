//package Time_Complexity;
//
//public class Practical_way {
//    public static void main(String[] args) {
//
//        int i = 0;
//        int n = 1000;
//
//        while (i < n) {
//            System.out.println("Hey");
//            i++;
//        }
////        o(N)
//
//        i = 1;
//        while (i <= n) {
//            System.out.println("Hey");    // o(1)
//            i *= 2;                   // o(1)
////            o(2)
//        }
////        o(log(N))
//
//        while (n > 0) {
//            System.out.println("Hey");
//            n /= 2;
//        }
////        o(log(N))
//
//
//        while (i <= n) {
//            System.out.println("Hey");
//
//            i += 2;
//            i += 3;
//        }
////        o(n)
//
//        while (i <= n) {
//            System.out.println("Hey");
//
//            i *= 2;
//            i *= 3;
//        }
//
////        o(log(n)) base 6
//
//        while (n > 0) {
//            System.out.println("Hey");
//
//            n /= 2;
//            n /= 3;
//        }
//
////        o(log(n)) base 6
//
//
//        while (i <= n) {
//            System.out.println("Hey");
//
//            i += k;
//        }
//
////        o(N/k)
//
//        while (i <= n) {
//            System.out.println("Hey");
//
//            i *= k;
//        }
//
////        o(log(N)) => base 6
//
//
//        while (n > 0) {
//            System.out.println("Hey");
//
//            n = n - 1;
//        }
////        o(N)
//
//
//
//        while (n > 0) {
//            System.out.println("Hey");
//            n = n - 2;
//            n = n - 3;
//        }
////        o(N)
//
//
//
//        while (n > 0) {
//            n = n - k;
//        }
//
//
//        for (i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.println("hey");
//            }
//        }
////        o(N^2)
//
//        for (i = 1; i * i <= n; i++) {
//            System.out.println("hey");
//        }
////        o(square_root(n))
//
//        for (i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                for (int k = 1; k <= x; k++) {
//                    System.out.println("Hey");
//                }
//            }
//        }
////        o(x n^2)
//
//        for (i = 1; i <= n; i++) {
//            for (int j = 1; j <= i * i; j++) {
//                for (int k = 1; k <= n / 2; k++) {
//                    System.out.println("hey");
//                }
//            }
//        }
////        o(n^4)
//
//        for( i=1; i<=n; i*=2) {
//            System.out.println("hey");
//
//        }
////        o(log(n))
//
//        for(i=n/2; i<=n; i++) {
//            for(int j=1; j<=n/2; j++) {
//                for(int k=1; k<=n; k=k*2) {
//                    System.out.println("hey");
//
//                }
//            }
//        }
//
//        for(i=1; i<=n; i++) {
//            for(int j=1; j<=n; j+=i) {
//                System.out.println("hey");
//            }
//        }
//
//
//    }
//
//
//    static boolean linearSearch(int[] arr , int target){
//
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] == target){
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
