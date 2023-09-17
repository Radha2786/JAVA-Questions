package Exams;

import java.util.Scanner;

public class CP_class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r =0;
        while(n-- >0){
            r+=sc.next().contains("+")? 1:-1;
        }
        System.out.println(r);
    }
}
