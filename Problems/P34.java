// P34. Write a Java program to convert a octal number to a decimal number. Go to the editor
// Input Data:
// Input any octal number: 10
// Expected Output
// Equivalent decimal number: 8

import java.util.Scanner;

public class P34 {
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
        // Convert octal to decimal
        int decimalNumber = octalToDecimal(octalNumber);
        // Display the result
        System.out.println("Decimal equivalent: " + decimalNumber);
        // Close the scanner
        scanner.close();
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

    // Function to convert octal to decimal
    private static int octalToDecimal(String octalNumber) {
        int decimalNumber = 0;
        int power = 0;

        // Iterate through the octal digits in reverse order
        for (int i = octalNumber.length() - 1; i >= 0; i--) {
            char digit = octalNumber.charAt(i);
            int digitValue = Character.getNumericValue(digit);
            
            // Update the decimal number using the octal digit and the current power of 8
            decimalNumber += digitValue * Math.pow(8, power);
            power++;
        }

        return decimalNumber;
    }
}
