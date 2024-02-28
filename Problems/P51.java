// P51. Write a Java program to convert a given string into lowercase. Go to the editor
// Sample Output:

// Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
// the quick brown fox jumps over the lazy dog.
import java.util.Scanner;
public class P51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        for(int i=1; i<=str.length(); i++){
            str = str.toLowerCase();
        }
        System.out.println("the string after conversion is: ");
        System.out.println(str);
    }
}
