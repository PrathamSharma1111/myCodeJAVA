// Write a Java program to convert a decimal number to octal number. Go to the editor
// Input Data:
// Input a Decimal Number: 15
// Expected Output
// Octal number is: 17
import java.util.Scanner;
public class P30 {
    public static void main(String[] args){
        int dec, rem, quot, i=1, j;
        int octalNum[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        dec = sc.nextInt();

        quot = dec;
        while(quot!=0){
            octalNum[i++] = quot%8;
            quot = quot/8;
        }

        System.out.println("octal number is: ");
        for(j=i-1; j>0; j--){
            System.out.print(octalNum[j]);
        }
        System.out.println();
    }
}
