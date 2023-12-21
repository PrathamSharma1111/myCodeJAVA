//Write a Java program to print 'Hello' on screen and then print your name on a separate line.
import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, "+name);
    }
}
