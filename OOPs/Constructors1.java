//CONSTRUCTORS IN JAVA

import java.util.Scanner;

//object aa for default constructor and object bb for parameterized constructor
public class Constructors1 {
    public static void main(String[] args){
        System.out.println("Default constructor");
        Sum aa = new Sum();
        //no values are passed to this object at the time of creation so it will call default constructor. and values stored in a and b will be 0 and 0.
        aa.display();
        //if we want to store the values in a and b, we will call input function for object aa. and then to perform addition operation, call function output for object aa.
        aa.input();
        aa.output();
        //when input() is called, it overrides the value initially present in a and b, and stores the new values entered by the user. 
        System.out.println("Parameterized constructor");
        Sum bb = new Sum(15, 30);   //this statement will call parameterized constructor and values 15 and 30 will be stored for int a and b.
        bb.display();
        bb.output();
        bb.input();     //calling this function will override the initially present values for object bb
        bb.display();      //will show the newly entered values in bb
        bb.output();

    }
}

class Sum{
     int a, b;
     //default constructor: 
     Sum(){
        a = 0; 
        b = 0;
     }
     Sum(int x, int y){
        a = x;
        b = y;
     }
     void input(){
        //functio to take input from user: 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();
     }
     void display(){
        //function to display the values stored in a and b:
        System.out.println("a = "+a);
        System.out.println("b = "+b);
     }
     void output(){
        int c = a+b;
        System.out.println("The sum of numbers is: "+c);
     }
}