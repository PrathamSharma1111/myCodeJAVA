//equality of 2 strings in JAVA
//equals:  checks for equality of 2 strings, (case sensitive)
//eqaulsIgnoreCase: checks equality of 2 strings, but the checking is non case sensitive. 
import java.util.Scanner;
public class Strings6 {
    public static void main(String[] args){
        String str1 = new String();
        String str2 = new String();

        // String str3 = new String();
        // String str4 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        str1 = sc.nextLine();
        System.out.println("Enter 2nd string: ");
        str2 = sc.nextLine();
        if(str1.equals(str2))
        System.out.println("Equal strings");
        else
        System.out.println("Not equal strings");

        // System.out.println("Enter 3rd string: ");
        // str3 = sc.nextLine();
        // System.out.println("Enter 4th string: ");
        // str4= sc.nextLine();
        if(str1.equalsIgnoreCase(str2))
        System.out.println("Equal strings");
        else
        System.out.println("Not equal strings");
    }
}
