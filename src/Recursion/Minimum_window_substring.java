package Recursion;

public class Minimum_window_substring {
    public static void main(String[] args) {
        String s ="ADOBECODEBANC";
        String t = "ABC";
        int [] frqt = new int[255];
        for(int i =0;i<t.length();i++){
            char ch = t.charAt(i);
            frqt[ch]++;
        }
        int [] arr= new int[255];
        int si=0;
        int ei =0;
        int start=-1;
        int len =Integer.MAX_VALUE;
        int count=0;
        while(ei<s.length()){
            char ch= s.charAt(ei);
            arr[ch]++;
            if(frqt[ch]>=arr[ch]){
                count++;
            }
            // shrinking state
            if(count==t.length()){
                //char c = s.charAt(si);
                while(arr[s.charAt(si)]>frqt[s.charAt(si)]){
                    arr[s.charAt(si)]--;
                    si++;
                }
                if(len>ei-si+1){
                    len = ei-si+1;
                    start = si;
                }

            }
            ei++;
        }
        if(start==-1){
            System.out.println("");
        }
        else
        System.out.println(s.substring(start,start+len));
    }
}
