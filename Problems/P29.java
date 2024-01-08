// Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
// Input Data:
// Input a decimal number: 15
// Expected Output

// Hexadecimal number is : F 

import java.util.Scanner;
public class P29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String hexDec_Num = "";
        char hexDec[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Enter a number to convert: ");
        int DecNum = sc.nextInt();
        int rem;
        while(DecNum!=0){
            rem = DecNum%16;
            hexDec_Num = hexDec[rem]+hexDec_Num;
            DecNum = DecNum/16; 
        }

        System.out.println("The hexadecimal number is: "+hexDec_Num);
    }
}
