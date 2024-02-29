//Hollow rectangle
import java.util.Scanner;
public class StarPattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int row = sc.nextInt();     //number of horizontal lines
        int column = sc.nextInt();         //number of vertical lines
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }   
            }
            System.out.print("\n");
        }
    }
}
