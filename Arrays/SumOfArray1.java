//Sum of array elements

import java.util.Scanner;
public class SumOfArray1 {
    public static void main(String[] args){
        int i, size;
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array: ");
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(i=0; i<size; i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of array elements is: "+sum);
    }
}
