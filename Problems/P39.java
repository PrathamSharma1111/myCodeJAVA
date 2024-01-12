// P39. Write a Java program to convert a hexadecimal to a octal number. Go to the editor
// Input Data:
// Input a hexadecimal number: 40
// Expected Output
// Equivalent of octal number is: 100

import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input hexadecimal number from the user
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimalNumber = scanner.nextLine();
        // Validate if the input is a valid hexadecimal number
        if (!isValidHexadecimal(hexadecimalNumber)) {
            System.out.println("Invalid hexadecimal number. Please enter a valid hexadecimal number.");
            return;
        }
        // Convert hexadecimal to octal
        String octalNumber = hexadecimalToOctal(hexadecimalNumber);
        // Display the result
        System.out.println("Octal equivalent: " + octalNumber);
        // Close the scanner
        scanner.close();
    }

    // Function to check if the input is a valid hexadecimal number
    private static boolean isValidHexadecimal(String hexadecimalNumber) {
        for (char digit : hexadecimalNumber.toCharArray()) {
            if (!Character.isDigit(digit) && (digit < 'A' || digit > 'F') && (digit < 'a' || digit > 'f')) {
                return false;
            }
        }
        return true;
    }

    // Function to convert hexadecimal to octal
    private static String hexadecimalToOctal(String hexadecimalNumber) {
        // Convert hexadecimal to decimal
        int decimalNumber = Integer.parseInt(hexadecimalNumber, 16);
        // Convert decimal to octal
        return Integer.toOctalString(decimalNumber);
    }
}