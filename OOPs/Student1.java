// example to illustrate class and object in java

//defining a class Student: 
public class Student1{
    int id;
    String name;
    //id and name are 2 data members (or field or instance variable) of the class Student.
    //creating main method in Student class-
    public static void main(String[] args){
        // creating object of Student class with new keyoword. 
        Student1 s1 = new Student1();
        //syntax to declare object  ==  //Class_name object_name = new Class_name();
        //printing the values of object
        System.out.println("Data for student 1: ");
        System.out.println(s1.id);
        System.out.println(s1.name);
        //both these lines will print null values i.e., 0 and null as id and name 

        System.out.println("Data for student 2: ");
        //creating object 2 of the class
        Student1 s2 = new Student1();
        s2.id = 004;
        s2.name = "pratham";
        //printing values for object s2:
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}