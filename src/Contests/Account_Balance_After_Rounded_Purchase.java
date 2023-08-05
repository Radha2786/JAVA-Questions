package Contests;

public class Account_Balance_After_Rounded_Purchase {
    public static void main(String[] args) {
        int purchaseAmount = 99;
        int smaller=0;
        int greater=0;
        for(int i=10;i<=100;i+=10){
            if(i<purchaseAmount){
                smaller=i;
            }
            if(i>=purchaseAmount){
                greater=i;
                break;
            }
        }
        Math.min(Math.abs(purchaseAmount-smaller),Math.abs(purchaseAmount-greater));
        if(Math.abs(purchaseAmount-smaller)==Math.abs(purchaseAmount-greater)){
            System.out.println(100-greater);
        }else if(Math.abs(purchaseAmount-smaller)<Math.abs(purchaseAmount-greater)){
            System.out.println(100-smaller);
        }else {
            System.out.println(100-greater);
        }
        System.out.println("---------------------------------------");
        System.out.println(smaller);
        System.out.println(greater);
    }
}
