//P27. Write a Java program to multiply two binary numbers. Go to the editor
// Input Data:
// Input the first binary number: 10
// Input the second binary number: 11
// Expected Output

// Product of two binary numbers: 110

import java.util.Scanner;

public class P27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        scanner.close();

        long result = multiplyBinary(binary1, binary2);

        System.out.println("Multiplication Result: " + Long.toBinaryString(result));
   
    }

    public static long multiplyBinary(String binary1, String binary2) {
        // Convert binary strings to long
        long num1 = Long.parseLong(binary1, 2);
        long num2 = Long.parseLong(binary2, 2);

        // Multiply the binary numbers
        long result = num1 * num2;

        return result;
    }
}
