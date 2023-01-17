public class Third_Maximum_Number_414 {
    public static void main(String[] args) {
        int[] arr = {1,2,-2147483648};
        System.out.println(third_largest(arr));
    }

    static int third_largest(int[] arr){
        int largest = arr[0];
        int second_larget = Integer.MIN_VALUE;
        int third_largest = Integer.MIN_VALUE;
        for(int i = 1  ; i < arr.length ; i++){
            if(arr[i] > largest){
                third_largest = second_larget;
                second_larget = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_larget && arr[i] != largest){
                third_largest = second_larget;
                second_larget = arr[i];
            }
            else if(arr[i] > third_largest && arr[i] != second_larget && arr[i] != largest){
                third_largest = arr[i];
            }
        }
        if(third_largest > 0)
            return third_largest;
        else
            return largest;
    }

}
