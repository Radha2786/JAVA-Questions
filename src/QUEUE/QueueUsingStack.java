package QUEUE;
// created by Radha  (Dequeue efficient)
//Enqueue = O(n)
//Dequeue = O(1);
import Dynamic.DynamicQueue;
import Dynamic.DynamicStack;
public class QueueUsingStack {
  // creating data member (stack) of DynamicStack
       private DynamicStack data;
       // creating constructor
    QueueUsingStack(){
        this.data= new DynamicStack();
    }
//    public void Enqueue(int item) throws Exception {
//        // creating temporary stack
//        DynamicStack temp = new DynamicStack();
//        while(!data.isEmpty()){
//            temp.push(this.data.pop());
//        }
//        data.push(item);
//        while(!temp.isEmpty()){
//            data.push(temp.pop());
//        }
//    }
//    public int dequeue() throws Exception {
//        return this.data.pop();
//    }
//    public int peek() throws Exception {
//        return this.data.peek();
//    }
    public void display(){
        data.display();
    }
//    public boolean isEmpty(){
//        return this.data.isEmpty();
//    }
//    public int front(){
//        return this.data.top;
//    }


    public void Enqueue(int item) throws Exception {
        this.data.push(item);
    }
    public int dequeue() throws Exception {
        DynamicStack temp = new DynamicStack();
        while(this.data.size()!=1){
            temp.push(this.data.pop());
        }
        int x= this.data.pop();
        while(temp.size()!=0){
            this.data.push(temp.pop());
        }
        return x;
    }

    public int getFront() throws Exception {
        DynamicStack temp = new DynamicStack();
        while(this.data.size()!=1){
            temp.push(data.pop());
        }
        int x= this.data.peek();
        while(temp.size()!=1){
            this.data.push(temp.pop());
        }
        return x;
    }

}
