import java.util.Scanner;

public class Constructor2 {
    public static void main(String[] args){
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        m = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        n = sc.nextInt();
        Sum aa = new Sum(m, n);     //values of m and n as entered by user will be stored as values of a and b
        aa.output();
    }
}

class Sum{
    int a, b;
    Sum(int x, int y){
       a = x;
       b = y;
    }
    
    void output(){
       int c = a+b;
       System.out.println("The sum of numbers is: "+c);
    }
}