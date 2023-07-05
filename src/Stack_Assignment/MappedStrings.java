package Stack_Assignment;

public class MappedStrings {
    public static void main(String[] args) {
        String str="123";
//        char[] arr ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        part(str , "");
    }

    static void part(String question , String ans){
        if(question.isEmpty()){
            System.out.println(ans);
        }

        for(int i = 1 ; i <= question.length() ; i++){
            String p = question.substring(0 , i);

            int value = Integer.parseInt(p);
            if(value > 26){
                return;
            }

            char ch = (char) (value + 64);
            part(question.substring(i) , ans+ch );
        }
    }
}
