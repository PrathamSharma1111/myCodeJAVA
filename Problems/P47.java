// Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative. 
// Sample Output:

// Input the first number : 5                                             
// Input the second number: 10                                            
// Input the third number : 15                                            
// The result is: true

import java.util.Scanner;
public class P47 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a%10==b%10 || a%10==c%10 || b%10==c%10){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
