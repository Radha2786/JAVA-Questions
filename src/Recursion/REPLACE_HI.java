package Recursion;
/*
Take as input str, a string.
a.) Write a recursive function which counts the number of times ‘hi’ appears in the string –
but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.
b.) Write a recursive function which removes all ‘hi’ in the string – but skip all such ‘hi’ which are followed
by ‘t’ to form ‘hit’. Print the value returned.
c.) Write a recursive function which replaces all ‘hi’ in the string with ‘bye’ – but skip all such ‘hi’
which are followed by ‘t’ to form ‘hit’. Print the value returned.
Input Format
Enter the String
Constraints
None
Output Format
Display the total no.of ''hi'' (''hi'' should not be followed by a 't'), string in which all ''hi'' are
removes(''hi'' should not be followed by a 't'), string in which all ''hi'' are
replace by ''bye''(''hi'' should not be followed by a 't')
Sample Input
abchihitfhi
Sample Output
2
abchitf
abcbyehitfbye
*/
public class REPLACE_HI {
    public static void main(String[] args) {
        String str = "abchihitfhia";
        int count=0;
        func(str,0,count);
    }
    static void func(String str,int i,int count){
        if(i>=str.length()-1){
            System.out.println(count);
        }
        if(str.charAt(i)=='h' && str.charAt(i+1)=='i' && str.charAt(i+2)!='t'){
            count=count+1;
            func(str,i+2,count);
        }else if(str.charAt(i)=='h' && str.charAt(i+1)=='i' && str.charAt(i+2)=='t'){
             func(str,i+3,count);
        }else{
            func(str,i+1,count);
        }
    }

}
