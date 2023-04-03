package GFG;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr =  {3,4,-1,1};
        boolean isOnePresent = false;
        for(int i=0;i<arr.length ; i++){
            if(arr[i]==1) {
                isOnePresent = true;
            }
            if(arr[i]<1){
                arr[i]=1;
            }
            // above range
            if(arr[i]>arr.length){
                arr[i]=1;
            }

        }
        if(isOnePresent==false){
//            return 1;
            System.out.println(1);
            return;
        }
        for(int i =0 ; i<arr.length ;i++){
                int pos = Math.abs(arr[i])-1;
                if(arr[pos]>0) {


                    arr[pos] *= -1;
                }

        }
        for(int i=0;i<arr.length ; i++){
            if(arr[i]>0){
//                return i+1;
                System.out.println(i+1);
                return;
            }
        }
//        return arr.length+1;
        System.out.println(arr.length+1);
    }
}
