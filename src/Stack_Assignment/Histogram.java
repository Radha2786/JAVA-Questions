package Stack_Assignment;
import java.util.*;
public class Histogram {
    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        Stack<Integer> stack = new Stack<>();
        int current_area=0;
        int max_area=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty() && height[i]<height[stack.peek()]){
                int element=height[stack.pop()];
                int right_index=i;

                if(stack.isEmpty()){
                     current_area=right_index*element;
                }else {


                    int left_index = stack.peek();
                    current_area = (right_index - left_index - 1) * element;
                }
                if(current_area>max_area){
                    max_area=current_area;
                }
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int element =height[ stack.pop()];
            if(stack.isEmpty()){
                current_area=height.length*element;
                if(current_area>max_area){
                    max_area=current_area;
                }
            }else{
                int left_index=stack.peek();
                current_area=(height.length-left_index-1)*element;
                if(current_area>max_area){
                    max_area=current_area;
                }
            }
        }
        System.out.println(max_area);
    }
}
