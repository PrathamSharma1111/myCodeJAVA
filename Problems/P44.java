//program to print the ASCII value of a character
import java.util.Scanner;
public class P44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char chr = sc.next().charAt(0);
        int asciiVal = chr;
        System.out.println("The ascii value of given character is: "+asciiVal);
    }
}
