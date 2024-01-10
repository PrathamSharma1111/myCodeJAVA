// P33. Write a Java program to convert a binary number to a Octal number. Go to the editor
// Input Data:
// Input a Binary Number: 111
// Expected Output
// Octal number: 7

import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        // scanner.close();
        String octalNumber = convertBinaryToOctal(binaryNumber);
        System.out.println("Octal Equivalent: " + octalNumber);
    }

    public static String convertBinaryToOctal(String binaryNumber) {
        // Convert binary to decimal
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        // Convert decimal to octal
        String octalNumber = Integer.toOctalString(decimalNumber);
        return octalNumber;
    }
}