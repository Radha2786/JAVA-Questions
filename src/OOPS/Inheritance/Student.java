package OOPS.Inheritance;

public class Student {
    String name;
    int age;

    Student(){

    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return this.name+" "+this.age;
    }
}
