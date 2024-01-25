// Write a Java program to compute the area of a hexagon.
// Area of a hexagon = (6 * s^2)/(4*tan(π/6))       //substitued tan(pi/6) = 0.5773
// where s is the length of a side
// Input Data:
// Input the length of a side of the hexagon: 6
// Expected Output

// The area of the hexagon is: 93.53074360871938
import java.util.Scanner;
//import java.math.*;
public class P40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        double pi = 3.14F;
        double area = (6 * size*size)/(4*0.5773);
        System.out.println("Area: "+area);
    }
    
}
