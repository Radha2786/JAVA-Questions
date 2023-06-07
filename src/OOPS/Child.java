package OOPS;

public class Child extends Parent {
    String name = "Radha";
    int ageC = 19;

    public void display(){
        System.out.println(name + " " + ageC);
    }

    public void games(){
        System.out.println("Cricket");
    }


    @Override
    public String toString(){
        return name + " " + ageC;
    }
}
