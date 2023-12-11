public class AssignmentOperator {
    public static void main(String[] args){
        int a = 15;
        int b = 2;

        System.out.println(a);      //a=15
        System.out.println(b);      //b=2

        a += 5;         //a = a+5 => a = 15+5 = 20
        b -= 8;         //b = b-8 => b = 2-8 = -6

        System.out.println(a);
        System.out.println(b);

        int c = 10;
        System.out.println(c);      //10
        c *= 3;         //s = s*3 = 10*3 = 30
        System.out.println(c);      //30
    }
}
