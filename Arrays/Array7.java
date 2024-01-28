//product of 2 matrix
import java.util.Scanner;
public class Array7 {
    public static void main(String[] args){
        A aa = new A();
        aa.getData();
        aa.putData();
        aa.mul();
    }
}

class A{
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    int i, j;
    
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of 1st matrix: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Enter number: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd matrix: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Enter number: ");
                b[i][j] = sc.nextInt();
            }
        }
    }

    void putData(){
        System.out.println("Matrix A: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Matrix B: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }
    }

    void mul(){
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                c[i][j] = 0;
                for(int k=0; k<3; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];

                }
            }
        }
        System.out.println("Multiplication is: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }
}