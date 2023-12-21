import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = n1*n2;
        System.out.println("Result: "+res);
    }
}
