// P35. Write a Java program to convert a octal number to a binary number. Go to the editor
// Input Data:
// Input any octal number: 7
// Expected Output
// Equivalent binary number: 111 

import java.util.Scanner;

public class P35 {
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
        // Convert octal to binary
        String binaryNumber = octalToBinary(octalNumber);
        // Display the result
        System.out.println("Binary equivalent: " + binaryNumber);
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

    // Function to convert octal to binary
    private static String octalToBinary(String octalNumber) {
        StringBuilder binaryNumber = new StringBuilder();

        // Iterate through each octal digit
        for (char digit : octalNumber.toCharArray()) {
            // Convert each octal digit to a 3-bit binary representation
            String binaryDigit = Integer.toBinaryString(Character.getNumericValue(digit));

            // Ensure the binary representation is 3 bits by padding with leading zeros if
            // necessary
            while (binaryDigit.length() < 3) {
                binaryDigit = "0" + binaryDigit;
            }

            // Append the binary representation to the result
            binaryNumber.append(binaryDigit);
        }

        return binaryNumber.toString();
    }
}