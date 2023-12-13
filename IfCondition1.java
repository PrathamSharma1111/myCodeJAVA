import java.util.Scanner;

public class IfCondition1 {
    public static void main(String[] args){
        System.out.println("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1+num2>50){
            System.out.println("sum of numbers is greater than 50");
        }
    }    
}
