package STACK;

import java.util.Arrays;
import java.util.Stack;

public class HISTOGRAM {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
//        System.out.println(left_and_right(heights));
    }

    static int Histogrm(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for (int i = 0 ; i < heights.length ; i++){

            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                int r = i;
                int h = heights[stack.pop()];
                int current_area = 0;
                if(!stack.isEmpty()){
                    int l = stack.peek();
                    current_area = h * (r-l-1);
                }
                else{
                    current_area = h * r;
                }

                area = Math.max(area , current_area);
            }

            stack.push(i);
        }

        int r = heights.length;
        while (!stack.isEmpty()){
            int h = heights[stack.pop()];
            int current_area = 0;
            if(!stack.isEmpty()){
                int l = stack.peek();
                current_area = h * (r-l-1);
            }
            else{
                current_area = h * r;
            }

            area = Math.max(area , current_area);
        }

        return area;
    }







//    static int left_and_right(int[] heights){
//        int[] left = prevSmaller(heights);
//        int[] right = nextSmaller(heights);
//        System.out.println(Arrays.toString(heights));
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
//        int area = 0;
//        for (int i = 0 ; i < heights.length ; i++){
//            int l = left[i];
//            int r = right[i];
//            int h = heights[i];
//            int current_area = 0;
//            if(l == -1){
//                current_area = h * r;
//            }
//            else{
//                current_area = h * (r - l - 1);
//            }
////            System.out.println(current_area);
//            area = Math.max(current_area , area);
//        }
//
//       return area;
//    }
//
//    static int[] nextSmaller(int[] arr){
//        int[] ans = new int[arr.length];
//        Stack<Integer> stack = new Stack<>();
//        for(int i = 0 ; i < arr.length ; i++){
//
//            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]){
////                O(1)
//                ans[stack.pop()] = i;
//            }
////            O(1)
//            stack.push(i);
//        }
//
//        while (!stack.isEmpty()){
//            ans[stack.pop()] = arr.length;
//        }
//
//        return ans;
//    }
//    static int[] prevSmaller(int[] arr){
//        int[] ans = new int[arr.length];
//        Stack<Integer> stack = new Stack<>();
//        for(int i = arr.length-1 ; i >= 0 ; i--){
//
//            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]){
//                int index = stack.pop();
//                ans[index] = i;
//            }
//
//            stack.push(i);
//        }
//
//        while (!stack.isEmpty()){
//            int index = stack.pop();
//            ans[index] = -1;
//        }
//
//        return ans;
//    }
}
