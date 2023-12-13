public class ForEachLoop {
    public static void main(String[] args){
        System.out.println("Vowels list in upper and lower case: ");
        char arr_vowels[] = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for(char i:arr_vowels){
            System.out.print(i+"\t");
        }
    }   
}
