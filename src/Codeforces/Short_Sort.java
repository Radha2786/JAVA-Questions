package Codeforces;
import java.util.*;

public class Short_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String ans="";
            String str = sc.next();
            if(str.charAt(0)=='a'){
                System.out.println(true);
            }else{
                char[] arr = str.toCharArray();
                for(int i=0;i<arr.length;i++){
                    if(arr[i]=='a'){
                        int index=i;
                        char temp=arr[0];
                        arr[0]='a';
                        arr[i]=temp;
                        for(int j=0;j<arr.length;j++){
                            ans+=arr[j];
                        }
                        System.out.println(ans);
                        if(ans.equals("abc")){
                            System.out.println(true);
                        }else{
                            System.out.println(false);
                        }
                    }
                }
            }
        }

    }
}
