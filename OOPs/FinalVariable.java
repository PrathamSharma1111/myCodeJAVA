public class FinalVariable {
    public static void main(String[] args){
        int a = 10;
        final int b = 20;
        System.out.println("A = "+a+" B = "+b);
        a = 12;
        //b = 30;       will cause an error
        System.out.println("A = "+a+" B = "+b);
    }
}
