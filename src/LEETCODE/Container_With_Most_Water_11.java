package LEETCODE;

public class Container_With_Most_Water_11 {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1,4} ;
        int index_1=0;
        int index_2=1;
        int largest = arr[0];
        int second_largest = arr[1];
        int third_largest = arr[1];
        int index_3=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
                index_1=i;
            }else if(arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
                index_2=i;
            }
        }

        System.out.println(index_1);
        System.out.println(index_2);




        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]>largest ||arr[j]==largest){
                third_largest=arr[j];
                index_3=j;
            }
        }
        System.out.println(index_3);
        int index=Math.max(index_2, index_3);
        System.out.println(index);
        int difference=index-index_1;
        int product=difference*second_largest;
        System.out.println(product);
    }
}
