//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
        System.out.println("Enter numbers to perform operations: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int add = n1+n2;
        int diff = n1-n2;
        int mul = n1*n2;
        float div = n1/n2;
        float rem = n1%n2;

        System.out.println("The result of the operations are: ");
        System.out.println("Addition: "+add);
        System.out.println("Difference: "+diff);
        System.out.println("Product: "+mul);
        System.out.println("Division: "+div);
        System.out.println("Remainder: "+rem);
    }
}
