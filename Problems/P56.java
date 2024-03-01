// P56. Write a Java program to compute the sum of the first 100 prime numbers. Go to the editor
// Sample Output:

// Sum of the first 100 prime numbers: 24133

public class P56 {
    public static void main(String[] args) {
        int count = 0;
        long sum = 0;
        int number = 2; // Start with the first prime number

        while (count < 100) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}