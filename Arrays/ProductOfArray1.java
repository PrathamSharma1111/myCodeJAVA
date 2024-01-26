//product of array elements
import java.util.Scanner;
public class ProductOfArray1 {
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

        int product = 1;
        for(i=0; i<size; i++){
            product = product*arr[i];
        }
        System.out.println("Product of array elements is: "+product);
    }
}
