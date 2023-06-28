
package Stack_Assignment;

        import java.util.Scanner;
        import java.util.Stack;

public class Form_minimum_number_from_given_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        int value=0;
        int ans=1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            String str=arr[i];
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)=='I'){
                    stack.push(value);
                    value++;
                }
                if(stack.isEmpty()){
                    stack.push(value);
                }
                if(str.charAt(j)=='D'){
//                    stack.pop();
                    ans=ans*10+stack.pop();
                }
            }

        }
        System.out.println(ans);
    }
}