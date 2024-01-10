// P32. Write a Java program to convert a binary number to hexadecimal number. Go to the editor
// Input Data:
// Input a Binary Number: 1101
// Expected Output

// HexaDecimal value: D

import java.util.Scanner;

public class P32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        // scanner.close();
        String hexadecimalNumber = convertBinaryToHex(binaryNumber);
        System.out.println("Hexadecimal Equivalent: " + hexadecimalNumber);
    }

    public static String convertBinaryToHex(String binaryNumber) {
        // Convert binary to decimal
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        // Convert decimal to hexadecimal
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        return hexadecimalNumber.toUpperCase();
    }
}