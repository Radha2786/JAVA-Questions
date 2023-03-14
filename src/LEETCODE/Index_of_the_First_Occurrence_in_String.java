package LEETCODE;

public class Index_of_the_First_Occurrence_in_String {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        boolean flag = false;
        int index=0;
        String  needle = "sad";
        int n = haystack.length();
//        for(int i=0;i<haystack.length();i++){
//            if(haystack.substring(i,n)==needle){
////                return i;
//                System.out.println(i);
//                return;
//            }
//
//            else{
//                i++;
//            }
//        }
        for(int i=0;i<haystack.length();i++){
            if(needle.charAt(0)==haystack.charAt(i)){
                 index=i;
                for(int j=1;j<needle.length();j++){
                    i++;
                    if(needle.charAt(j)==haystack.charAt(i)){
                        flag=true;
//
                    }else{
                        break;
                    }
//                    while(needle.charAt(j)==haystack.charAt(i)){
//                        flag=true;
//                    }
                }
            }
        }
        if(flag==true){
            System.out.println(index);
        }else{
            System.out.println(-1);
        }
//        return -1;
        System.out.println(-1);
    }
}
