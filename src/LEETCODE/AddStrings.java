package LEETCODE;

public class AddStrings {
    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "9";
       StringBuilder sb = new StringBuilder();
        StringBuilder sbld1 = new StringBuilder("10");
       int carry=0;
       int i=str1.length()-1;
       int j=str2.length()-1;
       while(i>=0 || j>=0){
           int sum1=0,sum2=0;
           if(i>=0){
               sum1+= str1.charAt(i--) -'0';
           }
           if(j>=0){
               sum2+=str2.charAt(j--)-'0';
           }
           int total_sum=sum1+sum2+carry;
           sb.append(total_sum%10);
           carry=total_sum/10;
       }
       if(carry!=0){
           sb.append(carry);
       }
        sb.reverse();
        System.out.println(sb.toString());






    }
}
