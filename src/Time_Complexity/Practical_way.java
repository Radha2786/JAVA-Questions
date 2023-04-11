package Time_Complexity;

public class Practical_way {
    public static void main(String[] args) {
        int starting = (int) System.currentTimeMillis();
//        System.out.println(starting);
        for (long i = 0 ; i <= 100000000l ; i++){

        }
        int ending = (int) System.currentTimeMillis();
//        System.out.println(ending);
        System.out.println(ending - starting);
    }
}
