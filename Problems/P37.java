// P37. Write a Java program to convert a hexadecimal to a decimal number. Go to the editor
// Input Data:
// Input a hexadecimal number: 25
// Expected Output

// Equivalent decimal number is: 37

import java.util.Scanner;

public class P37 {
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
        // Convert hexadecimal to decimal
        int decimalNumber = hexadecimalToDecimal(hexadecimalNumber);
        // Display the result
        System.out.println("Decimal equivalent: " + decimalNumber);
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
    // Function to convert hexadecimal to decimal
    private static int hexadecimalToDecimal(String hexadecimalNumber) {
        // Convert hexadecimal to decimal
        return Integer.parseInt(hexadecimalNumber, 16);
    }
}