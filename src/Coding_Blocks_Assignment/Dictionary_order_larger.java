package Coding_Blocks_Assignment;
import java.util.*;

public class Dictionary_order_larger {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> list = new ArrayList<>();
        DictionaryOrder(str, "", list);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(str) > 0) {
                System.out.println(list.get(i));
            }
        }
    }

    static void DictionaryOrder(String question, String ans, ArrayList<String> list){
        if(question.isEmpty()){
            list.add(ans);
            return;
        }

        for(int i=0;i<question.length();i++){

            String prefix = question.substring(0,i);
            String suffix = question.substring(i+1);
            char choose=question.charAt(i);
            DictionaryOrder(prefix+suffix,ans+choose,list);
        }


    }
}

