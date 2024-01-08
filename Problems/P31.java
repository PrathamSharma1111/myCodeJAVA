// P31. Write a Java program to convert a binary number to decimal number. Go to the editor
// Input Data:
// Input a binary number: 100
// Expected Output

// Decimal Number: 4
import java.util.Scanner;
public class P31 {
    public static void main(String[] args){
        long BinNum, DecNum = 0, rem, j=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        BinNum = sc.nextLong();

        while(BinNum > 0){
            rem = BinNum%10;
            DecNum = DecNum + rem*j;
            j = j*2;
            BinNum = BinNum/10;
        }
        System.out.println("Decimal number is: "+DecNum);

    }
}
