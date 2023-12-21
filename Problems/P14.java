//Write a Java program and compute the sum of the digits of an integer. 
import java.util.Scanner;
public class P14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("The sum of digits of the number is: "+sum);
    }
}
