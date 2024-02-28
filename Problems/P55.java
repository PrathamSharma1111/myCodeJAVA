// Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
// Test data:
// Input the first number : 5
// Input the second number: 3
// 2
// Input the first number : 19
// Input the second number: 7
// 5

import java.util.Scanner;
public class P55 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend, divisor, quot, rem;
        System.out.println("Enter 1st number (dividend): ");
        dividend = sc.nextInt();
        System.out.println("Enter 2nd number (divisor): ");
        divisor = sc.nextInt();
        quot = dividend/divisor;
        rem = dividend - (quot*divisor);
        System.out.println("The remainder is: "+rem);
    }
}
