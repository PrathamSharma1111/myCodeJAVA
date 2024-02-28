// P52. Write a Java program to capitalize the first letter of each word in a sentence. Go to the editor
// Sample Output:

// Input a Sentence: the quick brown fox jumps over the lazy dog.         
// The Quick Brown Fox Jumps Over The Lazy Dog.

import java.util.Scanner;
public class P52 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String capitalizedString = capitalizeWords(str);
        System.out.println("Capitalized string: " + capitalizedString);
        sc.close();
    }

    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        String[] words = str.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                sb.append(firstLetter).append(word.substring(1)).append(" ");
            }
        }

        return sb.toString().trim();
    }
}