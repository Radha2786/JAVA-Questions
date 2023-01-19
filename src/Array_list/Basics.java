package Array_list;

import java.util.ArrayList;
import java.util.Collection;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        for(int i = 0 ; i < 10 ; i++){
            list.add(i);
        }

    }
}
