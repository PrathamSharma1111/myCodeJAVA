//compare two numbers using equals function.

import java.util.Scanner;
public class P13A {
    public static void main(String[] args){
        System.out.println("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // if(n1.equals(n2)){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.equals(s2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
