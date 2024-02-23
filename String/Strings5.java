//to check whether a string is palindrome or not

import java.util.Scanner;
public class Strings5 {
    public static void main(String[] args){
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        s = sc.nextLine();
        int i, j, flag;
        i = 0; j = s.length()-1; flag = 0;      //flag = 0 means the string is a palindrome
        while(i<j && flag==0){
            if(s.charAt(i) != s.charAt(j))
            flag = 1;
            i = i+1;
            j = j-1;
        }
        if(flag == 0)
        System.out.println("Palindrome");
        else{
            System.out.println("not palindrome");
        }
    }
}
