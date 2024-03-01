// P57. Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length. Go to the editor
// Test Data: Str1 = Python
// Str2 = Tutorial
// Sample Output:
// PythonTutorialPython

import java.util.Scanner;
public class P57{
    public static void main(String[] args){
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        s1 = sc.nextLine();
        System.out.println("Enter string 2: ");
        s2 = sc.nextLine();
        if(s1.length()>s2.length()){
            System.out.println(s2+s1+s2);
        }
        else{
            System.out.println(s1+s2+s1);
        }
    }
}