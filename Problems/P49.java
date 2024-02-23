// P49. Write a Java program to find the number of values in a given range divisible by a given value. Go to the editor
// For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
// Sample Output:

// 5

import java.util.Scanner;
public class P49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y, p, count=0;
        System.out.println("Enter 2 numbers for range: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Enter the number to check: ");
        p = sc.nextInt();
        for(int i=x; i<=y; i++){
            if(i%p==0){
                count = count+1;
            }
        }
        System.out.println("total "+count+" are divisible");
    }
}
