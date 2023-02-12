package Recursion;

public class Geekonacci {
    public static void main(String[] args) {
//        int first=1,second=3,third=2;
        int n=5;
        System.out.println(Geekonacci_number(n));
    }
    static int Geekonacci_number(int n){
        if(n==3){
            return 2;
        }
        if(n==2){
            return 3;
        }
        if(n==1){
            return 1;
        }
        int first=Geekonacci_number(n-1);
        int second = Geekonacci_number(n-2);
        int third=Geekonacci_number(n-3);
        return first+second+third;

    }
}
