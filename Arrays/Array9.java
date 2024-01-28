//transpose of a matrix

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args){
        A aa = new A();
        aa.getData();
        aa.putData();
        aa.transpose();
    }
}

class A{
    Scanner sc = new Scanner(System.in);
    int i, j;
    int arr[][] = new int[3][3];
    void getData(){
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Enter element: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    void putData(){
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }
    void transpose(){
        System.out.println("Transpose of the matrix is: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(arr[j][i]+"    ");
            }
            System.out.println();
        }
    }
}