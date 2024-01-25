//ARRAYS: to print the index of a number present in the array.

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Enter a number to search: ");
        int val = sc.nextInt();
        for(int i=0; i<size; i++){
            if (num[i] == val){
                System.out.println("The number is found at index "+i);
            }
            else{
                System.out.println("the number is not present in the list!!");
            }
        }
    }
}
