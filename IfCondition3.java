
import java.util.Scanner;
public class IfCondition3 {
    public static void main(String[] args){
        System.out.println("Enter number of sides: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n == 0)||(n==1)||(n==2)){
            System.out.println("Case not possible!!");
        }
        else if(n==3){
            System.out.println("Triangle");
        }
        else if(n == 4){
            System.out.println("Rectangle / Square / Rhombus etc");
        }
        else{
            System.out.println("Polygon with more than 5 sides");
        }
    }
}
