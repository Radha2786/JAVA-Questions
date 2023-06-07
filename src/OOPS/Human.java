package OOPS;

import java.util.Scanner;

public class Human {

    private String name = "Ram";
    private int age = 7000;

    public Human(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("My name is " + this.name + " and my age is " + this.age);
    }

//    ENCAPSULATION


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) throws Exception {
//        if(age < 0){
//           throw new Exception("baklol,chutiye AGE NEGATIVE NHI HOO SAKTI");
//        }
//        this.age = age;
//    }


//        public void setAge(int age){
//        try {
//            if(age < 0){
//                throw new Exception("BAKLOL AGE NEGATIVE NHI HOO SAKTI");
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            Scanner sc = new Scanner(System.in);
//            System.out.println("ENTER NON NEGATIVE AGE");
//            age = sc.nextInt();
//        }
//        finally {
//            this.age = age;
//        }
//
//    }

}

