package Exams;
import java.util.*;

public class CP_class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            char[] ch = new char[n];
//            char[] ch=s.next().toCharArray();
            for(int i=0;i<n;i++){
                ch[i] = sc.next().charAt(0);
            }
            int occuranceofq=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]=='q'){
                    occuranceofq++;
                }else{
                    Math.max(0,occuranceofq--);
                }
            }
            if(occuranceofq==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
