//P7. Write a Java program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;
public class P7 {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
