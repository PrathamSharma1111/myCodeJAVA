//P21. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.  
// Sample Output:
// Input the first number: 5                                             
// Input the second number: 10                                            
// Input the third number: 15                                            
// The result is: true



import java.util.Scanner;
public class P21 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        num3 = sc.nextInt();

        if(num1+num2 == num3){
            System.out.println("True");
        }
    }
}
