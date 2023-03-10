package LEETCODE;
import java.util.Arrays;

public class _1bit_and_2bit_Characters {
    public static void main(String[] args) {
       int[] bits = {1,0,0};
        int i=0,temp=0;
        while(i<bits.length-1){
            if(bits[i]==1){
                i=i+2;
                temp=i;
            }else{
                i=i+1;
                temp=i;
            }
        }
        if(temp==bits.length-1){
//            return true;
            System.out.println("true");
        }else{

//            return false;
            System.out.println("false");
        }

    }
}
