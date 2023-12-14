//object initialization using methods

public class OOP2 {
    public static void main(String[] args){
        //creating objects:
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        //calling function insertRecord for all 3 objects created.. 
        s1.insertRecord(101, "abc");
        s2.insertRecord(102, "pqr");
        s3.insertRecord(103, "xyz");
        //calling function showData for object s1 and s3..
        s1.showData();
        s3.showData();
    }
}

class Student{
    int roll_no;
    String name;

    void insertRecord(int r, String n){
        //function to enter the data of students..
        roll_no = r;    //storing the value of roll_no in variable r and name in n
        name = n;
    }
    void showData(){
        //function to display the data of students.. 
        System.out.println(roll_no+" "+name);
    }
}