//create and display unique 3 digit number using 1,2,3,4 and also count how many 3-digit numbers are there. 

public class P43 {
    public static void main(String[] args){
        int count = 0; 
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                for(int k=1; k<=4; k++){
                    if(k!=i && k!=j && i!=j){
                        count++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("The total number of combinations possible: "+count);
    }
}
