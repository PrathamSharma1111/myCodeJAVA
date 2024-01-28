//Addition and subtarction in 2D array (matrix)

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args){
        A aa = new A();
        aa.getData();
        aa.add();
        aa.sub();
        aa.putData();
    }
}
class A{
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    int d[][] = new int[3][3];

    void getData(){
        Scanner sc = new Scanner(System.in);
        int i, j;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Enter number: ");
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Enter number: ");
                b[i][j] = sc.nextInt();
            }
        }
    }
    void add(){
        int i, j;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }
    void sub(){
        int i, j;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                d[i][j] = a[i][j] - b[i][j];
            }
        }
    }
    void putData(){
        System.out.println("matrix A: ");
        int i, j;
        //i = 0; j = 0      //if error occurs
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Matrix B: ");
        
        //i = 0; j = 0      //if error occurs
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Sum of A and B: ");
        
        //i = 0; j = 0      //if error occurs
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Difference of A and B: ");
        //i = 0; j = 0      //if error occurs
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(d[i][j]+"  ");
            }
            System.out.println();
        }
    }
}