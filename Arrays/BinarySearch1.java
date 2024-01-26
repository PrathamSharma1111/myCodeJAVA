//BINARY SEARCH: 
import java.util.Scanner;
public class BinarySearch1 {
    public static void main(String[] args){
        A aa = new A();
        aa.getData();
        aa.search();
    }
}
class A{
    int arr[] = new int[7];
    int key;
    void getData(){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter elements of array: ");
        for(i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        key = sc.nextInt();
    }
    void search(){
        int i, j, mid, flag, pos=0;
        i = 0; j = 7;
        flag = 0;
        while(i<=j && flag==0){
            mid = (i+j)/2;
            if(arr[mid] == key){
                flag=1; 
                pos = mid+1;
            }
            if(arr[mid] > key){
                j = mid-1;
            }
            if(arr[mid] < key){
                i = mid+1;
            }
            
        }
        if(flag == 0){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element is found at "+pos);
        }
    }
}