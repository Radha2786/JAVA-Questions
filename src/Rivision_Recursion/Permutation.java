package Rivision_Recursion;

public class Permutation {
    public static void main(String[] args) {
        String question = "abac";
        Print_Permutation(question,"");
    }
    public static void Print_Permutation(String question, String ans){
        if(question.length()==0){
            System.out.println(ans);
            return ;
        }

//            for (int i = 0; i < question.length(); i++) {
//                char ch = question.charAt(i);
//                String prefix = question.substring(0, i);
//                String suffix = question.substring(i + 1);
////                    question = prefix.concat(suffix);
////            question = prefix+suffix;
//
////                    Print_Permutation(question,ans+ch);
//                Print_Permutation(prefix + suffix, ans + ch);
//
//        }

        // for Repeated characters

        for (int i = 0; i < question.length(); i++) {
            char ch = question.charAt(i);
            Boolean flag = true;
            for(int j=i+1;j<question.length();j++){
                if(question.charAt(j)==ch){
                    flag = false;
                    break;
                }
            }
            if(flag) {


                String prefix = question.substring(0, i);
                String suffix = question.substring(i + 1);
//                    question = prefix.concat(suffix);
//            question = prefix+suffix;

//                    Print_Permutation(question,ans+ch);
                Print_Permutation(prefix + suffix, ans + ch);
            }

        }

    }
}
