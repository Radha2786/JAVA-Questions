package STACK;

public class Reverse_Stack {
    public static void main(String[] args) throws Exception {
        MeraStack stack = new MeraStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        reverse(stack);
        stack.display();
    }


    static void reverse(MeraStack stack) throws Exception {

        if(stack.isEmpty()){
            return;
        }

        int data = stack.pop();

        reverse(stack);

        pushAtBottom(stack , data);
    }

    static void pushAtBottom(MeraStack stack , int val) throws Exception {
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }

        int data = stack.pop();

        pushAtBottom(stack , val);

        stack.push(data);
    }
}
