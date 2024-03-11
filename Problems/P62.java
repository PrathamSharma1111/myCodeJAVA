// P62.  Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays.  
// Test Data: array1 = 50, -20, 0
// array2 = 5, -50, 10
// Sample Output:
// Array1: [50, -20, 0]                                                   
// Array2: [5, -50, 10]                                                   
// New Array: [50, 10]

import java.util.Scanner;
public class P62 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        System.out.println("Enter elements of 1st array: ");
        for(int i=0; i<3; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of 2nd array: ");
        for(int i=0; i<3; i++){
            arr2[i] = sc.nextInt();
        }
        int arr_new[] = {arr1[0], arr2[2]};
        System.out.println("New array: ");
        for(int i=0; i<2; i++){
            System.out.println(arr_new[i]);
        }
    }
}
