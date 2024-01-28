//2D array

import java.util.Scanner;

import java.util.Scanner;
public class Array5 {
    public static void main(String[] args){
        A aa = new A();
        aa.getData();
        aa.putData();
    }
}

class A{
    int a[][] = new int[3][3];
    void getData(){
        Scanner sc = new Scanner(System.in);
        int i, j;
        //i = 0; j = 0      //if error occurs
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Enter number: ");
                a[i][j] = sc.nextInt();
            }
        }
    }
    void putData(){
        int i, j;
        //i = 0; j = 0      //if error occurs
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
