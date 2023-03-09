package LEETCODE;

public class passThePillow {
    public static void main(String[] args) {
        int n=18 , time=38;
        int t=0;
        int ans=0;
        boolean flag = false;
        for(int i=1;i<=n;i++){
            t=t+1;
            if(t==time){
//                System.out.println(i+1);
                ans=i+1;
                flag=true;
            }
        }
        if (flag==true){
            System.out.println(ans);;
        }
        while(t>=n){
            for(int j=n-1;j>=1;j--){
                t=t+1;
                if(t==time){
                    System.out.println(j-1);
                    break;
                }
                while(j==1){
                    for(int k=1;k<=n;k++){
                        t=t+1;
                        if(t==time){
                            System.out.println(k+1);
                            break;
                        }
                    }
                }

            }
        }
//        return -1;
    }
}
