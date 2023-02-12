//Program for length of a string using recursion
package Recursion;

public class length_of_a_string_using_recursion {
    public static void main(String[] args) {
        String str = "RadhaSharma";
        System.out.println(Count(str));
    }
    static int Count(String str){
        if(str.equals("")){
            return 0;
        }
        return 1+Count(str.substring(1));

    }
}
