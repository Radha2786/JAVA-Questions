package OOPS;

public class Function_Overloading {

    public int add(int a , int b){
        return a + b;
    }

    public int add(int a , int b , int c){
        return a + b + c;
    }

    public int add(int a , double b){
        return (int) ((int) a + b);
    }

    public int add(int... a){
        int sum = 0;
        for(int i = 0 ; i < a.length ; i++){
            sum += a[i];
        }
        return sum;
    }
    static void display(){
        System.out.println("HELLO");
    }

    static {
        System.out.println("HAHAHA!!!!");
    }

    public static void main(String[] args) {
        Function_Overloading ob = new Function_Overloading();
        System.out.println(ob.add(5 , 10 ,20 , 30 , 40 ,20 ,0,29));
        Function_Overloading ob2 = new Function_Overloading();
        System.out.println(ob2.add(10 , 39 , 39));

//        Function_Overloading.display();

    }
}
