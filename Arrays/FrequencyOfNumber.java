
import java.util.Scanner;
public class FrequencyOfNumber {
    public static void main(String[] args){
        frequency aa = new frequency();
        aa.getData();
        aa.count();
    }
}

class frequency{
    int arr[] = new int[6];
    int key;
    void getData(){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter elements of array: ");
        for(i=0; i<6; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to find frequency: ");
        key = sc.nextInt();
    }

    void count(){
        int i, count=0;
        for(i=0; i<6; i++){
            if(arr[i] == key){
                count = count+1;
            }
        }
        System.out.println("frequency: "+count);
    }
}