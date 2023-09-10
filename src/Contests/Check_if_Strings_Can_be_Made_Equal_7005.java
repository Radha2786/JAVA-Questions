package Contests;

public class Check_if_Strings_Can_be_Made_Equal_7005 {
    public static void main(String[] args) {
        String s1 = "abcdba";
        String s2 = "cabdab";
        boolean ans=check2(s1,s2);
        System.out.println(ans);
    }
    static boolean flag = true;
    public static  boolean check2(String str, String str2) {
        char[] ch1 = str.toCharArray();
        char[] ch2 = str2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i]) {
                continue;
            } else {
                if(i%2==0 && i<str.length()-3){
                    for(int j=i;j<str.length()-3;i++){

                        if (ch1[j+2] == ch2[i]) {
                            char temp = ch1[i];
                            ch1[i] = ch1[i + 2];
                            ch1[i + 2] = temp;
                            flag=true;
                        } else {
//                            return false;
                            flag=false;
                        }
                    }
                }else{
                    return false;
                }

            }
        }
        if(flag==false){
            return false;
        }
        return true;
    }
}
