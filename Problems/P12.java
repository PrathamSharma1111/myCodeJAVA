// P12. Write a Java program to swap two variables without using 3rd variable.

import java.util.Scanner;
public class P12 {
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swapped numbers: "+a+" and "+b);
    }
}
