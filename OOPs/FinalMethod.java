public class FinalMethod {
    public static void main(String[] args){
        Base o1 = new Base();
        o1.display();
        Derived o2 = new Derived();
        o2.display();
        o2.display1();
    }
}

class Base{
    final void display(){
        System.out.println("Base Class");
    }
}
class Derived extends Base{
    void display1(){
        System.out.println("Derived Class");
    }
}

//if the method created in the base class is declared as final, then it can't be created in derived class.
//if we try to create the methpd of same name, we will get an error. 