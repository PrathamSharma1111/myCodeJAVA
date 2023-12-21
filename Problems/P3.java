//Write a Java program to divide two numbers and print on the screen.
import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        float res = num1/num2;
        System.out.println("The result is: "+res);
    }
}
