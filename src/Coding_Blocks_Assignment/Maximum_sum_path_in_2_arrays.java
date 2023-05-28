package Coding_Blocks_Assignment;

public class Maximum_sum_path_in_2_arrays {
    public static void main(String[] args) {
        int[] arr1 = {6,8,15,17,20,27,31,33};
        int[] arr2 ={2,9,13,21,25,32,34};
        int i=0,j=0;
        int ans=0;
        int p1=i, p2=j;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else{
                int sum1=0;
                int sum2=0;
                for(int k=p1 ; k<=i ; k++){
                    sum1+=arr1[k];
                }
                for(int k=p2 ; k<=j ; k++){
                    sum2+=arr2[k];
                }
                ans+= Math.max(sum1,sum2);
                i++;
                j++;
                p1=i;
                p2=j;
            }
        }
//        if(i==arr1.length)
//        {
//            for(int k=p2 ; k<arr2.length ; k++){
//                ans+=arr2[k];
//            }
//        }else{
//            for(int k=p1 ; k<arr1.length ; k++){
//                ans+=arr1[k];
//            }
//        }
        long sum1=0;
        long sum2=0;
        for(int k=p1 ; k<arr1.length;k++){
            sum1+=arr1[k];
        }
        for (int k=p2;k<arr2.length;k++){
            sum2+=arr2[k];
        }
        ans+=Math.max(sum1,sum2);
        long mod = (long)Math.pow(10,9)+7;
//        return (int) (ans%mod);
        // ans+=Math.max(sum1,sum2);
        System.out.println((int)(ans%mod));

    }
}
