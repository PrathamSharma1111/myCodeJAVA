//introduction to strings in JAVA:

import java.util.Scanner;
public class Strings1 {
    public static void main(String[] args){
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        str = sc.next();
        System.out.println("hello "+str);
    }
}
