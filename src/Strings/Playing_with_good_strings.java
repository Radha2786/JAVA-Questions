package Strings;

public class Playing_with_good_strings {
    public static void main(String[] args) {
        String str="cbaeicde";
        int p1=0,p2=0;
        int count =0,max=0;
        while(p2<str.length()){
            while(str.charAt(p2)=='a' || str.charAt(p2)=='e' || str.charAt(p2)=='i'|| str.charAt(p2)=='o'|| str.charAt(p2)=='u'){
                count++;
                if(count>max){
                    max=count;
                }
                if(p2==str.length()-1){
                  break;
                }else{
                    p2++;
                }


            }
            count=0;
            p1=p2;
            p2++;
            p1++;
        }
        if(count>max){
            max=count;
        }
        System.out.println(max);
    }
}
