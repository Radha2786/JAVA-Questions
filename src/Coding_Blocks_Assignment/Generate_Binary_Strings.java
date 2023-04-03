package Coding_Blocks_Assignment;
import java.util.*;

public class Generate_Binary_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            ArrayList<String> list = new ArrayList<>();
            Generate_string(str,"",list);
            System.out.println(list);
        }
    }
    static void Generate_string(String str,String ans,ArrayList<String> list){
        if(str.isEmpty()){
            list.add(ans);
            return ;
        }
        if(str.charAt(0)=='?'){
            Generate_string(str.substring(1),ans+'0',list);
            Generate_string(str.substring(1),ans+'1',list);
        }else{
            Generate_string(str.substring(1),ans+str.charAt(0),list);
        }

    }
}
