//To check whether a given number is prime or not using concept of class and object

import java.util.Scanner;

public class OOP4{
    public static void main(String[] args){
        PrimeNo num = new PrimeNo();
        num.getData();
        num.putData();
    }
}
class PrimeNo{
    int n;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        n = sc.nextInt();
    }
    void putData() {
        int i, count=0;
        for(i=1; i<=n; i++){
            if(n%i == 0){
                count = count+1;
            }  
        }
        if(count == 2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }

}