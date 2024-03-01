// P58. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.  
// Test Data: Str1 = Python
// Str2 = Tutorial
// Sample Output: ythonutorial

import java.util.Scanner;
public class P58 {
    public static void main(String[] args){
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        s1 = sc.nextLine();
        System.out.println("Enter string 2: ");
        s2 = sc.nextLine();
        System.out.println(s1.substring(1)+s2.substring(1));
    }
}
