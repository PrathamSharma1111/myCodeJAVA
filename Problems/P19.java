//P19. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
import java.util.Scanner;
public class P19 {
    public static void main(String[] args){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number to check: ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("1");    //prints 1 if the number is even
        }
        else{
            System.out.println("0");    //print 0 if the number is odd
        }
    }
}
