package OOPS;

//import java.util.Scanner;

public class School {
    public static void main(String[] args) {
//        Scanner sc = new Scanner()

//        Student s1 = new Student();
//
////        System.out.println(s1.name);
////        System.out.println(s1.age);
//
//        s1.name = "Radha";
//        s1.age = 19;
//
//        s1.display();
//
//        Student s2 = new Student();
//
////        System.out.println(s2.name);
////        System.out.println(s2.age);
//
//
//        s2.name = "Harsh";
//        s2.age = 19;
//
//        s2.display();

        Student s2 = new Student();
        Student s3 = new Student();
        s2.name = "Radha";
        s2.age = 100;
        s3.name = "Harsh";
        s3.age = 10;
        System.out.println(s2.name + " " + s2.age);   // Radha and 100
        System.out.println(s3.name + " " + s3.age);   // Harsh and 10
        System.out.println(".....................");
//         Test1(s2, s3);
//         Test2(s2, s3);

        int my_age = 20;
        String my_name = "C";
        Test3(s2, s3.age, s3.name, my_age, my_name);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);
    }

    public static void Test3(Student s, int age, String name, int myAge, String myName) {
        s.age = 0;
        s.name = "_";
        age = 0;
        name = "_";
        myAge = 0;
        myName = "_";
    }


    public static void Test2(Student s2, Student s3) {

        s2 = new Student();
        int tempa = s2.age;
        s2.age = s3.age;
        s3.age = tempa;
        s3 = new Student();
        String tempn = s2.name;
        s2.name = s3.name;
        s3.name = tempn;
    }


    public static void Test1(Student s2, Student s3) {
        Student t = s2;
        s2 = s3;
        s3 = t;

    }

}
