package Strings;

public class Add_Binary {
    public static void main(String[] args) {
        String a="0";
        String b="0";
        int n=0;
        int m=0;
        int j=0;
        int k=0;
        String ans="";
        for(int i=a.length()-1;i>=0;i--){
            char c=a.charAt(i);
            int num=Integer.parseInt(String.valueOf(c));
            j+=num*Math.pow(2, n);
            n++;
        }
        System.out.println(j);
        for(int i=b.length()-1;i>=0;i--){
            char c=b.charAt(i);
            int num=Integer.parseInt(String.valueOf(c));
            k+=num*Math.pow(2, m);
            m++;
        }
        System.out.println(k);
        String str="";
        int num2=j+k;
        System.out.println(j+k);
        while(num2!=0){
            int rem=num2%2;
            str+=String.valueOf(rem);
            num2=num2/2;
        }

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            ans=ans+ch;
        }
        System.out.println(ans+"this is ans");

    }
}
