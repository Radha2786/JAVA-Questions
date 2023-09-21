package Codeforces;
import java.util.*;
public class Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char[][] arr = new char[10][10];
            for(int i=0;i<10;i++){
                String str = sc.next();
                for(int j=0;j<10;j++){
                    arr[i][j]=str.charAt(j);
                }
            }
        }
    }
}
