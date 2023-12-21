// P11. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;
public class P11 {
    public static void main(String[] args){
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        double avg = (num1+num2+num3)/3;
        System.out.println("Average: "+avg);
    }
}
