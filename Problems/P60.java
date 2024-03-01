// P60. Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2. Go to the editor
// Test Data: array = 50, -20, 0, 30, 40, 60, 10

import java.util.Scanner;
public class P60 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0] == arr[size-1]){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
