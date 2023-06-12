package STACK.Questions;
//https://leetcode.ca/all/1063.html#:~:text=Given%20an%20array%20A%20of,other%20elements%20in%20the%20subarray.

//https://www.interviewbit.com/problems/nearest-smaller-element/

//Number of NGEs to the righthttps://practice.geeksforgeeks.org/problems/number-of-nges-to-the-right/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-nges-to-the-right
//https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/
//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
import java.util.Stack;

public class Number_of_Valid_Subarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int[]  ans =new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int index = stack.pop();
                ans[index] = arr[i];
                stack.push(i);
            }
        }
    }
}
