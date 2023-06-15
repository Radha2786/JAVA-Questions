package STACK.Questions;

import Dynamic.DynamicQueue;

//pop efficient code
//Push O(n)
//pop o(1)

public class StackUsingQueue {
    private DynamicQueue data;

    // initialising data
    // creating constructor
    StackUsingQueue(){
        this.data= new DynamicQueue();
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    public int size(){
        return this.data.size();
    }
    public void push(int item) throws Exception {
        // creating temporary queue
        DynamicQueue temp = new DynamicQueue();
        while(!data.isEmpty()){
            temp.enqueue(data.dequeue());
        }
        data.enqueue(item);
        while(!temp.isEmpty()){
            data.enqueue(temp.dequeue());
        }

    }
    public int pop() throws Exception {
        return this.data.dequeue();
    }

    public int peek() throws Exception{
        return this.data.front;
    }
    public void display(){
        this.data.display();
    }

}
