package OOPS.Inheritance;

public class StudentClient {
    public static void main(String[] args) {
        Student ob = new Student("Radha",19);
        Object b = new Object();
        System.out.println(ob); // this will give address


        // by default in java Object class is the parent of all classes
//        hence sabhi classes object class ko inherit kar rhi hoti h to object class ke methods bhi show hote hain

//        jab bhi hum kuch print karate h to object class ka to string method by default call ho jata h
//                which gives address , we can overwrite that toStringMethod to print whatever we want

    }



}
