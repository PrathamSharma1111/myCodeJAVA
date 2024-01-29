//functions in JAVA: 
//length(): returns the length of the given string
//charAt(): returns the character at the given index

import java.util.Scanner;
public class Strings2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter any string: ");
        s = sc.next();
        System.out.println("the length of the entered string is: "+s.length());
        System.out.println("enter index to find the character at that position: ");
        int pos = sc.nextInt();
        System.out.println("The character is : "+s.charAt(pos));
    }
}
