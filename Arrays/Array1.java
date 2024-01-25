//Arrays in JAVA

public class Array1{
    public static void main(String[] args) {
        //Declaration: 3 methods-
        //DatatType[] ArrayName = new DataType[sizeOfArray];
        //DataType ArrayName[] = new DataType[SizeOfArray];
        int[] numbers = new int[5];         //int numbers[] = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        //int numbers[] = {10, 20, 30, 40, 50};

        //to print elements of array
        for(int i=0; i<5; i++){
            System.out.println(numbers[i]);
        }
    }
}