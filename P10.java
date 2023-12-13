// P10. Write a Java program to print the area and perimeter of a circle and rectangle.

import java.util.Scanner;
public class P10 {
    public static void main(String[] args){
        //CIRCLE:
        System.out.println("Enter the radius for circle: ");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        double Area_Circle, Per_Circle, pi=3.14F;
        Area_Circle = pi * rad * rad;
        Per_Circle = pi*2*rad;
        System.out.println("Area of circle is: "+Area_Circle);
        System.out.println("Perimeter of circle is: "+Per_Circle);
        //RECTANGLE: 
        System.out.println("Enter the length and breadth of rectangle: ");
        int len = sc.nextInt();
        int br = sc.nextInt();
        double Area_Rect, Per_Rect;
        Area_Rect = len*br;
        Per_Rect = 2*(len+br);
        System.out.println("Area of rectangle is: "+Area_Rect+" and perimeter is: "+Per_Rect);
    }
}
