//https://leetcode.com/problems/repeated-substring-pattern/

public class AxisOrbitPc {
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(Palindromic_Substrings(str));
    }
    static String Palindromic_Substrings(String str){
        int count=0;
        int length=0 , max=0;
        String ans ="";
//        odd axis
        for(int axis=0 ; axis<str.length() ; axis++){
            length=0;
            for(int orbit=0 ; axis-orbit>=0 && axis+orbit<str.length() ;orbit++){
                if(str.charAt(axis-orbit)!=str.charAt(axis+orbit)){
                    break;
                }else{
                    count++;
                    length++;
                    if(length>max){
                        max=length;
                        ans="";
                        ans+=str.substring(axis-orbit,axis+orbit+1);
                    }
                }
            }
        }
        // even axis
        for(double axis=0.5 ; axis<str.length() ; axis++){

            for(double orbit=0.5 ; axis-orbit>=0 && axis+orbit<str.length() ;orbit++){

                if(str.charAt((int)(axis-orbit))!=str.charAt((int)(axis+orbit))){
                    break;
                }else{
                    count++;
                }
            }
        }
//        return count ;
        return ans;
    }
}
