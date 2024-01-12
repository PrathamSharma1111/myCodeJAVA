// P36. Write a Java program to convert a octal number to a hexadecimal number. Go to the editor
// Input Data:
// Input a octal number : 100
// Expected Output
// Equivalent hexadecimal number: 40

import java.util.Scanner;

public class P36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input octal number from the user
        System.out.print("Enter an octal number: ");
        String octalNumber = scanner.nextLine();
        // Validate if the input is a valid octal number
        if (!isValidOctal(octalNumber)) {
            System.out.println("Invalid octal number. Please enter a valid octal number.");
            return;
        }
        // Convert octal to hexadecimal
        String hexadecimalNumber = octalToHexadecimal(octalNumber);
        // Display the result
        System.out.println("Hexadecimal equivalent: " + hexadecimalNumber);
        // Close the scanner
        // scanner.close();
    }

    // Function to check if the input is a valid octal number
    private static boolean isValidOctal(String octalNumber) {
        for (char digit : octalNumber.toCharArray()) {
            if (digit < '0' || digit > '7') {
                return false;
            }
        }
        return true;
    }

    // Function to convert octal to hexadecimal
    private static String octalToHexadecimal(String octalNumber) {
        // Convert octal to decimal
        int decimalNumber = Integer.parseInt(octalNumber, 8);

        // Convert decimal to hexadecimal
        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        return hexadecimalNumber.toUpperCase(); // Convert to uppercase for consistency
    }
}