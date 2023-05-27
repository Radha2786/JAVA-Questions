package Arrays;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        int[] arr = {5,-3,5};

        int n =arr.length;
       int linearKadane=KadaneAlgo(arr);

       boolean flag = false;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               flag=true;
           }
       }
       // calculating sum
        if(flag==true) {


            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                arr[i] = arr[i] * -1;
            }
//       int sum2=0;
//       for(int i=0;i<arr.length;i++){
//           sum2+=arr[i];
//       }
            int invertedKadane = KadaneAlgo(arr);
            int circularMax = sum + invertedKadane;
            System.out.println(Math.max(linearKadane, circularMax));
        }else{
//            return linearKadane;
            System.out.println(linearKadane);
        }

    }
    public static int KadaneAlgo(int[] arr){
        int sum=0 , max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
