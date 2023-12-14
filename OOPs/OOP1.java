//object initialization with reference variable

public class OOP1{
    public static void main(String[] args){
        Students s1 = new Students();
        Students s2 = new Students();       //we can create one or multiple objects of a class 
        s1.id = 001;
        s1.name = "abc";
        s1.age = 20;
        s2.id = 002;
        s2.name = "pqr";
        s2.age = 21;

        ///printing data: 
        System.out.println(s1.id+" "+s1.name+" "+s1.age);
        System.out.println(s2.id+" "+s2.name+" "+s2.age);

    }
}

class Students{
    int id;
    String name; 
    int age;
}