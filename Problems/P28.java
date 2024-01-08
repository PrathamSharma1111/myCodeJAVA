// P28. Write a Java program to convert a decimal number to binary number. Go to the editor
// Input Data:
// Input a Decimal Number : 5
// Expected Output
// Binary number is: 101
import java.util.Scanner;
public class P28 {
    public static void main(String[] args){
        int decimal, quot, i, j;
        int binNum[] = new int[100];
        i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert to binary: ");
        decimal = sc.nextInt();
        
        quot = decimal;
        while(quot!=0){
            binNum[i++] = quot%2;
            quot = quot/2;
        }

        System.out.println("Binary number is: ");
        for(j=i-1; j>0; j--){
            System.out.print(binNum[j]);
        }
        
    }
}
