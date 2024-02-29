//Solid Rectangle

import java.util.Scanner;
public  class StarPattern1{
    public static void main(String[] args){
        System.out.println("Enter values of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int n = 5;
        // int m = 4;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
