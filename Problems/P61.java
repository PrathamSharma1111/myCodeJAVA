// Write a Java program to test if the first or the last element of two array of integers are same.  
// Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
// array2 = 45, 20, 10, 20, 30, 50, 11
// Sample Output:

// false

import java.util.Scanner;
public class P61 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        System.out.println("enter elements of array 1: ");
        for(int i=0; i<size; i++){
            arr1[i] = sc.nextInt();
        } 
        System.out.println("enter elements of array 2: ");
        for(int i=0; i<size; i++){
            arr2[i] = sc.nextInt();
        } 

        if(arr1[0] == arr2[0] || arr1[size-1] == arr2[size-1]){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
