import java.util.Scanner;

public class SingleInheritance1 {
    public static void main(String[] args){
        B aa = new B();
        aa.input();
        aa.output();
        aa.getData();
        aa.output();
    }
}

class A{
    int a, b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
    }
    void result(){
        System.out.println("result: "+(a+b));
    }
}
class B extends A{
    int c;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        c = sc.nextInt();
    }
    void output(){
        System.out.println("Result: "+(a+b+c));
    }
}