//P16. Write a Java program to count the letters, spaces, numbers and other characters of an input string. 

import java.util.Scanner;
public class P16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a string:  ");
        str = sc.nextLine();
        char ch[] = str.toCharArray();
        int letter = 0,  sp = 0, num = 0, other = 0;
        for(int i = 0; i<str.length(); i++){
            if(Character.isAlphabetic(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else if(Character.isSpaceChar(ch[i])){
                sp++;
            }
            else{
                other++;
            }
        }
        System.out.println("The number of letters are: "+letter+" ,digits: "+num+" ,spaces: "+sp+" and special characters are: "+other);
    }
}
