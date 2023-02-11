package Recursion;

public class count_the_occurance {
    public static void main(String[] args) {
        String str="baaccabbb";
        char ch= 'a';
        System.out.println(Count_occurance(str,0,0,ch));
    }
    static int Count_occurance(String str,int count,int i,char ch){
        if(i==str.length()){
            return count;
        }
        if(str.charAt(i)==ch){
            count++;
        }
        return Count_occurance(str,count,i+1,ch);

    }
}
