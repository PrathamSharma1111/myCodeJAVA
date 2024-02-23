//P42. write a program to reverse a string
import java.util.Scanner;

public class P42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        char[] s = sc.nextLine().toCharArray();
        System.out.println("Reverse string: ");
        for(int i=s.length-1; i>=0; i--){
            System.out.print(s[i]);
        }
    }
}
