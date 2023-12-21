import java.util.Scanner;


public class MultipleInheritance1 {
    public static void main(String[] args){
        C aa = new C();
        aa.getData1();
        aa.getData2();
        aa.result();
    }
}
class A{
    int a;
    void getData1(){
        System.out.println("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    }
}
class B extends A{
    int b;
    void getData2(){
        System.out.println("Enter 2nd number: ");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
    }
}
class C extends B{
    
    //int res = a+b;
    void result(){
        System.out.println("Result: "+(a+b));
    }
}