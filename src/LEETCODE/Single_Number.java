package LEETCODE;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums ={4,1,2,1,2};
        boolean flag = true;
        int ele =nums[0];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    ele=nums[j];
                    continue;
                }
                if(nums[i]==nums[j]){
                    flag=false;
                    continue;
                }else{
                    flag=true;
                    ele=nums[j];
                }
            }
            if(flag==true){
//                return ele;
                System.out.println(ele);
                return;

            }
        }
//        return ele;
        System.out.println(ele);
        return;
    }
}
