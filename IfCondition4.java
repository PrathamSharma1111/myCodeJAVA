import java.util.Scanner;

public class IfCondition4 {
    public static void main(String[] args){
        System.out.println("Enter value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();
        if(a>0){
            System.out.print("The number is positive.. ");
            if(a%2 == 0){
                System.out.print("and even");
            }
            else{
                System.out.print(" and odd");
            }
        }
        else if(a<0){
            System.out.print("the number is negative..");
            if(a%2 == 0){
                System.out.print("and even");
            }
            else{
                System.out.print(" and odd");
            }
        }
        else{
            System.out.print("User entered number is zero");
        }
        
    }
}
