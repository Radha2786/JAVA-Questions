package LEETCODE;

// primes in a given range (gfg)

public class Count_Prime_in_range {
    public static void main(String[] args) {
        int R =10;
        int L=5;
        System.out.println( primeSeives(R,L));
    }
    static int primeSeives(int R, int L){
        boolean[] arr = new boolean[R+1];
        int n=R;
        arr[0] = arr[1] = true;
        for(int i = 2;i<=n;i++){
            if(arr[i] == false){
                for(int j=2;i*j<=n;j++){
                    arr[j*i]=true;
                }
            }
        }
        int count = 0;
        for(int i = L; i <=R; i++){
            if(arr[i] == false){
                // System.out.print(i + " ");
                count++;
            }
        }
//        System.out.println(count);
        return count;
    }
}
