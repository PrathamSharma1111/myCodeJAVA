//counting total number of vowels or consonants in given string

import java.util.Scanner;
public class Strings3 {
    public static void main(String[] args){
        String s = new String();
        int i, vow = 0, cons = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        s = sc.nextLine();
        s = s.toUpperCase();
        for(i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c!=' '){
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    vow = vow+1;
                }
                else{
                    cons = cons+1;
                }
            }
        }
        System.out.println("Vowels: "+vow+" and consonants: "+cons);
    }
}
