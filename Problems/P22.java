//Q53 acc to site
//P22. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number. 
import java.util.Scanner;;
public class P22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Enter 3 numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n2>n1 && n3>n2){
            System.out.println("true");
        }
    }
}
