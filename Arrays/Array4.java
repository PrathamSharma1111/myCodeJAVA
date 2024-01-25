//Array using forEach loop

import java.util.Scanner;
public class Array4{
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array1[] = new int[size];
        for(int i=0; i<size; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("The elements entered by user are: ");
        for(int k:array1){
            System.out.println(k);
        }
    }
}
