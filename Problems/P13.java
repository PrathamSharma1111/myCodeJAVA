// P13. Write a Java program to compare two numbers.

import java.util.Scanner;
public class P13 {
    public static void main(String[] args){
        System.out.println("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>n2){
            System.out.println("first number "+n1+" is greater");
        }
        else if(n2>n1){
            System.out.println("second number "+n2+" is greater");
        }
        else{
            System.out.println("Both are equal!!");
        }
    }
}
