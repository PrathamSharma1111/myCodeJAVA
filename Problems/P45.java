//accepts an integer n and computes the value of n+nn+nnn
import java.util.Scanner;
public class P45 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        System.out.println(n+"+"+n+n+"+"+n+n+n);
        //System.out.printf("%d + %d%d + %d%d%d", n, n, n, n, n, n);
    }
}
