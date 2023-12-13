import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        System.out.println("Enter number to print the list: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("List:  ");
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }    
}
