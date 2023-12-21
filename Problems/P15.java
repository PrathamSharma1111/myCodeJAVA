import java.util.*;

public class P15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a string to reverse: ");
        str = sc.nextLine();
        char ch;
        String nstr = " ";
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed string: "+nstr);
    }
}
