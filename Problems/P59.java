//Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.

import java.util.Scanner;
public class P59 {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int size;
        // System.out.println("enter size of array: ");
        // size = sc.nextInt();
        // int arr[] = new int[size];
        // System.out.println("Enter elements of array: ");
        // for(int i=0; i<size; i++){
        //     arr[i] = sc.nextInt();
        // }
        //     if(arr[0] == 10 || arr[size-1] == 10){
        //         System.out.println("true");
        //     }
        //     else{
        //         System.out.println("false");
        //     }
        System.out.println(fun());
    }
             int fun(){
                static int x=0;
                return ++x;
            }        
    
}
