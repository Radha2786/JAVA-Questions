package Sliding_window;

public class Optimal_partitioning_of_string_leetcode {
        public static void main(String[] args) {
            int s=0,e=0;
            String str="abacaba";
            int count=0;
            String ans="";
            while(e<str.length()){
                // grow
                char choose = str.charAt(e);
                for(int i=0;i<ans.length();i++){
                    if(ans.charAt(i)==choose) {
                        // shrink
                        while (s <= e) {
                            if (str.charAt(s) == ans.charAt(i)) {
                                count++;
                                ans = "";
                                s++;
                                break;
//                            continue;
                            }
                            s++;
                        }
                    }
                }
                e++;
                ans=ans+choose;
            }
            System.out.println(count+1);
        }

}
