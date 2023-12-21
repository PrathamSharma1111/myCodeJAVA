//P20. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. 
import java.util.Scanner;
public class P20 {
    public static void main(String[] args){
        System.out.println("\nnumber divisible by 3: ");
        for(int i=1; i<=100; i++){
            if(i%3 == 0){
                System.out.print(i+", ");
            }
        }
        System.out.println("\nnumber divisible by 5: ");
        for(int i=1; i<=100; i++){
            if(i%5 == 0){
                System.out.print(i+", ");
            }
        }
        System.out.println("\nnumber divisible by 3 and 5: ");
        for(int i=1; i<=100; i++){
            if(i%15 == 0){
                System.out.print(i+", ");
            }
        }
    }
}
