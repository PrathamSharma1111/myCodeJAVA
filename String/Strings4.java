//to count the total number of words in a string 

import java.util.Scanner;
public class Strings4 {
    public static void main(String[] args){
        String s = new String();
        int i, count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        s = sc.nextLine();
        for(i=0; i<s.length(); i++){
            // char c, d;
            // c = s.charAt(i);
            // d = s.charAt(i+1);
            if(s.charAt(i)== ' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("Total words in string are: "+count);
    }
}
