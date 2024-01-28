//sum of elements of a row or column of a matrix. 

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args){
        A aa = new A();
        aa.getData();
        aa.putData();
        aa.rowSum();
        aa.ColSum();
    }
}

class A{
    int a[][] = new int[3][3];
    int i, j;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    void putData(){
        System.out.println("Matrix is: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    void rowSum(){
        int sum = 0;
        for(i=0; i<3; i++){
            sum = 0;
            for(j=0; j<3; j++){
                sum = sum + a[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row = "+sum);
        }
        
    }

    void ColSum(){
        int sum = 0;
        for(j=0; j<3; j++){
            sum = 0;
            for(i=0; i<3; i++){
                sum = sum + a[i][j];
            }
            System.out.println("Sum of "+(j+1)+" column = "+sum);
        }
        
    }
}