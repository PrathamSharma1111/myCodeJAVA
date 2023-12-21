public class MethodOverriding1 {
    public static void main(String[] args){
        DerivedClass obj = new DerivedClass();
        obj.display();
    }
}

class BaseClass{
    void display(){
        System.out.println("Base Class");
    }
}

class DerivedClass{
    void display(){
        System.out.println("Derived Class");
    }
}