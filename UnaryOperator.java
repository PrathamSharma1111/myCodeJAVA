public class UnaryOperator {
    public static void main(String[] args){
        int a = 10;
        System.out.println(a++);        //10
        System.out.println(a);          //value of a was increased by previous statement so a = 11

        int b = 5;
        System.out.println(++b);        //6
        System.out.println(b++);        //6 is priinted and then it is increased
        System.out.println(b);          // 7

        int c = 8;
        System.out.println(c--);        //8     // but the value is decreased after printing
        System.out.println(--c);        //6

        int x = 20, y = 35;
        System.out.println(x++ + ++x);      //20 + 22 = 42
        System.out.println(x++ + y++);      //22 + 35 = 57
    }
}