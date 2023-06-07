package Rivision_Recursion;

public class Letter_Combination_of_a_phone_number {
    public static void main(String[] args) {
        String digits ="23";
        String[] arr ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Print_combinations(digits,arr,"");

    }
    public static void Print_combinations(String digits,String[] arr,String ans){
        if(digits.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        int n =digits.charAt(0)-'0';
            String choices = arr[n];
            for(int j=0;j<choices.length();j++){
                Print_combinations(digits.substring(1),arr,ans+choices.charAt(j));
            }



    }
}
