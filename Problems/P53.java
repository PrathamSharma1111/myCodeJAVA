// P53. Write a Java program to reverse a word.  
// Sample Output:
// Input a word: dsaf
// Reverse word: fasd

import java.util.Scanner;
public class P53 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.next();
        String res = "";
        char[] ch = s.toCharArray();
        for(int i=ch.length-1; i>=0; i--){
            res += ch[i];
            //System.out.println(ch[i]);
        } 
        System.out.println(res);
    }
}
