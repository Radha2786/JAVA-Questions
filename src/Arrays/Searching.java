package Arrays;
//find value of X such that x^2 is less than k
// Binary Search (Coding blocks vdo)

public class Searching {
    public static void main(String[] args) {
        int N = 47;
        int s=1 , end = N;
        int ans=0;
        while(s<=end){
            int mid = s+(end-s)/2;
            if(mid*mid<=N){
                ans=mid;
                s=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
}
