import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class HeirarchicalInheritance1 {
    public static void main(String[] args){
        B obj1 = new B();
        obj1.getData1();
        obj1.add();
        C obj2 = new C();
        obj2.getData1();
        obj2.sub();
    }
}

class A{
    int a, b;
    Scanner sc = new Scanner(System.in);
    void getData1(){
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();
    }
}
class B extends A{
    void add(){
        System.out.println("Addition of the numbers is: "+(a+b));
    }
}
class C extends A{
    void sub(){
        System.out.println("Difference of the numbers is: "+(a-b));
    }
}