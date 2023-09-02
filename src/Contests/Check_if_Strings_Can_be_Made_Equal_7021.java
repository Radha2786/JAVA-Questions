package Contests;

public class Check_if_Strings_Can_be_Made_Equal_7021 {
    public static void main(String[] args) {
        String str="abcd";
        String str2 ="cdab";
        boolean flag2=true;
        boolean flag1=true;
//        for(int i=0;i<2;i++){
//            if(str.charAt(i)==str2.charAt(i)){
//                continue;
//            }else{
//                if(str.charAt(i+2)==str2.charAt(i)){
//                    continue;
//                }else{
////                    return false;
//                    flag1=false;
//                }
//            }
//        }
//        for(int i=3;i>1;i--){
//            if(str.charAt(i)==str2.charAt(i)){
//                continue;
//            }else{
//                if(str.charAt(i-2)==str2.charAt(i)){
//                    continue;
//                }else{
////                    return false;
//                    flag2=false;
//                }
//            }
//        }
//        return flag1 && flag2;
//        System.out.println(flag1 && flag2);
        System.out.println(check(str,str2));


    }
    public static  boolean check(String str, String str2) {


        char[] ch1 = str.toCharArray();
        char[] ch2 = str2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i]) {
                continue;
            } else {
                    if(i==0 || i==1){
                        if (ch1[i + 2] == ch2[i]) {
                            char temp = ch1[i];
                            ch1[i] = ch1[i + 2];
                            ch1[i + 2] = temp;
                        } else {
                            return false;
                        }
                    }else{
                        return false;
                    }

            }
        }
        return true;
    }
}
