// P46. Write a Java program to convert a string to an integer in Java. 
// Sample Output:

// Input a number(string): 25                                             
// The integer value is: 25

import java.util.Scanner;
public class P46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a number as string: ");
        str = sc.nextLine();
        int num = Integer.parseInt(str);
        System.out.println("the number in integer format is: "+num);
    }
}
