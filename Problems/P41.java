// Write a Java program to compute the area of a polygon. Go to the editor
// Area of a polygon = (n*s^2)/(4*tan(π/n))
// where n is n-sided polygon and s is the length of a side
// Input Data:
// Input the number of sides on the polygon: 7
// Input the length of one of the sides: 6
// Expected Output

// The area is: 130.82084798405722

import java.util.Scanner;
public class P41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sides: ");
        int side = sc.nextInt();
        System.out.println("Enter length: ");
        int len = sc.nextInt();
        double pi = 3.14;
        double area = (side*len*len)/(4*Math.tan(pi/side));
        System.out.println("Area of polygon: "+area);
    }
}
