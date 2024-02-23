// P48. Write a Java program to convert seconds to hour, minute and seconds.  
// Sample Output:
// Input seconds: 86399                                                   
// 23:59:59

import java.util.Scanner;
public class P48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int seconds;
        System.out.println("Enter seconds: ");
        seconds = sc.nextInt();
        int S = seconds%60;
        int H = seconds/60;
        int M = H%60;
        H = H/60;
        System.out.println("The time is: "+H+":"+M+":"+S);
    }
}
