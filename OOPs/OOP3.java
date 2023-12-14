//reverse the number program using concept of class and object

import java.util.Scanner;
public class OOP3 {
    public static void main(String[] args){
        reverse num = new reverse();        //creating num as the object of class reverse 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse: ");
        int m = sc.nextInt();
        
        num.getData(m);
        num.showResult();
    }
}

class reverse{
    int n;
    void getData(int i){
        n = i;
    }
    void showResult(){
        int rev = 0;
        while(n>0){
            rev = (rev*10) + n%10;
            n = n/10;
        }
        System.out.print("Reversed number is: "+rev);
    }
}
