package LEETCODE;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "aabb";
        int index=-1;
        for(int i=0;i<s.length();i++){
            Boolean flag = false;
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(ch==s.charAt(j)){
                    flag= true;
                    break;
                        }
                    }
            for(int j=i-1;j>=0;j--){
                if(ch==s.charAt(j)){
                    flag= true;
                    break;
                }
            }
            if(flag==false){
                index =i;
                         System.out.println(i);
                         return;
//                        return index;
                    }
                }
        System.out.println(index);
    }
}
