// P50. Write a Java program to accepts an integer and count the factors of the number. Go to the editor
// Sample Output:

// Input an integer: 25                                                   
// 3

import java.util.Scanner;
public class P50 {
    public static void main(String[] args){
        int num; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num = sc.nextInt();
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        System.out.println("number of factors: "+count);
    }
}
