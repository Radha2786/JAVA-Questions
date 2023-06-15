package Contests;

public class leetcode_2734 {
    public static void main(String[] args) {
        // starts loop from 0 if there is a then continue else convert character in while loop again if a encounter then break
        String str="aaabca";
        char[] arr =str.toCharArray();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                continue;
            }

            while(i<arr.length && arr[i]!='a'){
                arr[i]=(char)(arr[i]-1);
                flag=true;
                i++;
            }
            break;
        }
        if(!flag){
            arr[arr.length-1]='z';
        }
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        System.out.println(ans);
    }
}
