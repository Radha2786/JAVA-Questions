package Strings;

import java.util.ArrayList;
import java.util.*;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
//        ArrayList<ArrayList<String>>  items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};

//        ArrayList<ArrayList<String>>  items = new ArrayList<ArrayList<String> >();
        String[][] items ={{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey="type";
        String ruleValue="phone";
        int count =0;
        if(ruleKey.equals("color")){
            for(int i=0;i<items.length ; i++){
                if(items[i][1].equals(ruleValue)){
                    count++;
                }

            }
        }else if(ruleKey.equals("type")){
            for(int i=0;i<items.length ; i++){
                if(items[i][0].equals(ruleValue)){
                    count++;
                }

            }

        }else{
            for(int i=0;i<items.length ; i++){
                if(items[i][2].equals(ruleValue)){
                    count++;
                }

            }

        }
//        return count;
        System.out.println(count);
    }
}
