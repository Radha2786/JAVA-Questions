package Contests;

// through sliding window
// revise

public class FindtheLongestSemiRepetitiveSubstring {
    public static void main(String[] args) {
        String str = "52233";
        int left=0;
        int right=0;
        int len=0;
        while(right<str.length()){
            if(check(str.substring(left,right+1))){
                // calculating max length
                len = Math.max(len,right-left+1);
                // increasing window
                right++;
            }else{
                // shrinking window from left
                left++;
            }
        }
        System.out.println(len);
    }
    public static boolean check(String st){
        int count=0;
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)==st.charAt(i+1)){
                count++;
            }
        }
        if(count<=1){
            return true;
        }
        return false;
    }
}
