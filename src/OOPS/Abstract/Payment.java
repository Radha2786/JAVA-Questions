package OOPS.Abstract;

public class Payment extends Bank_Account {
    @Override
    public boolean payment() {
        return false;
    }

    public static void main(String[] args) {
        Payment pp = new Payment();
        System.out.println(pp.payment());

    }
}


