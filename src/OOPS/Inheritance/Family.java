package OOPS.Inheritance;


import OOPS.Inheritance.Child;

public class Family {
    public static void main(String[] args) {
//        CASE 1
//        P -> RV && P -> OB

//        Parent ob = new Parent();
//
//        System.out.println(ob.name); // MP SHARMA
//        System.out.println(ob.ageP); // 48
//        ob.display(); // MP SHARMA 48
//        ob.Address(); // ADDRESS


//        CASE 2
//        P -> RV && C -> OB

//        Parent ob = new Child();
//        System.out.println(ob.name);
//        ob.display();  //child class ka display aayega kyuki jiska object banate(ya jisko new kiye hai) usi ke blueprint m sabse phle
//        jake check hota hai

//        ob.Address();
//        System.out.println(((Child) ob).ageC);
//        ((Child) ob).games();      // parent class m game method h nhi isliye compiler ka muh band karane ke liye
        // typecast kar diya

//        CASE 3
//        C -> RV && P -> OB
//        Child ob = new Parent();

//        CASE 4
//        C -> RV && P -> C

        Child ob = new Child();
//        System.out.println(ob.name);
//        System.out.println(ob.ageC);
//        ob.display();
//        ob.Address();

        System.out.println(ob);

//        ArrayList<>

    }
}


// NOTE: (especially for case 2)= code likhte tym control compiler ke paas hota hai and vo sirf left wali cheej ko execute
//krta hai  isliye it can only access data memebers of P during compile tym but run tym m Jvm c ke data members ko bhi access
//kar paayega but compiler ka muh band karane ke liye hum type cast kar dte h

// IN CASE OF METHODS
//method overloading ka concept aa jata hai inheritance mein
