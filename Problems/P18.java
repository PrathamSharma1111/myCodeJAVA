//P18. Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. 

public class P18 {
    public static void main(String[] args){
        //int num;
        for(int i=1; i<=99; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
