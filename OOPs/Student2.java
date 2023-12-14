//example to show class and object with the main class in another class.
//
public class Student2 {
    public static void main(String[] args){
        TestStudent s1 = new TestStudent();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
//class TestStudent does not contain main method, it is not declared as public, if we write public class TestStudent, it shows error as:
//Error:  class TestStudent is public, should be declared in a file named TestStudent.java
class TestStudent{
    int id;
    String name;
}