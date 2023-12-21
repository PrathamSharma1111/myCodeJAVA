//Static member function 
import java.util.Scanner;
public class StaticMemberFunction{
    public static void main(String[] args){
        Student s1 = new Student(101, "NameA");
        Student s2 = new Student(102, "NameB");
        s1.display();
        s2.display();
        //a static function is called by class and not by object name. 
        Student.Change();
        s1.display();
        s2.display();
    }
}

class Student{
    int roll_no;
    String name;
    static String cName = "XYZ College";
    //parameterized constructor
    Student(int x, String y){
        roll_no = x;
        name = y;
    }
    //Normal function 
    void display(){
        System.out.println("Roll number: "+roll_no+" Name: "+name+" College: "+cName);
    }
    //static function to change the value of statoic variable:
    //(static function can use only static variable)
    static void Change(){
        cName = "ABC College";
    }
}