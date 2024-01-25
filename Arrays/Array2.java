//array basics: 

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        // for(int i=0; i<size; i++){
        //     System.out.println(num[i]);
        // }
        //line 9-11 will cause all the elements to be 0 because no data is stored in the array!!
        //It is called automatic initialization with null values. 

        // to store values by taking input from user:
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        // to print the values: 
        System.out.println("The array is: ");
        for(int i=0; i<size; i++){
            System.out.println(num[i]);
        }
    }
}
