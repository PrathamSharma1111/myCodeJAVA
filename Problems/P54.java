// Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6. Go to the editor
// Sample Output:

// Input the first number : 12                                            
// Input the second number: 13                                            
// Result: 13
import java.util.Scanner;
public class P54 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Result: "+result(n1, n2));
    }
    public static int result(int a, int b) {
        if(a == b)
            return 0;
        if(a%6 == b%6)
            return (a<b)?a:b;
        return (a>b)?a:b;
    }
}
