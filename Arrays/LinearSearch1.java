import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args){
        linear bb = new linear();
        bb.getData();
        bb.search();
    }
}

class linear{
    int arr[] = new int[5];
    int key;
    void getData(){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("enter elements of array: ");
        for(i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        key = sc.nextInt();
    }
    void search(){
        int i, pos, flag=0;
        for(i=0; i<5 && flag==0; i++){
            if(arr[i] == key){
                pos = i+1;
                flag = 1;
            }  
        }
        if(flag == 1){
            System.out.println("element found at index: "+i);
        }
        else{
            System.out.println("element not found");
        }
    }
}

