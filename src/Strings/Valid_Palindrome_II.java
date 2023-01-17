package Strings;

public class Valid_Palindrome_II {
    public static void main(String[] args) {
        String s  ="abc";
                int p1=0;
                int p2=s.length()-1;
                String str="";
                while(p1<=p2){
                    if(s.length()%2==0){
                        if(s.charAt(p1)!=s.charAt(p2)){
                            str=str+s.charAt(p1);
                        }else{
                            str=str+s.charAt(p2);
                            p1++;
                            p2--;
//                            str=str+s.charAt(p1);
                        }

                    }else{
                        if(s.charAt(p1)!=s.charAt(p2)){
                            System.out.println(false);
                        }
                    }

                }
        System.out.println(true);



    }
}
