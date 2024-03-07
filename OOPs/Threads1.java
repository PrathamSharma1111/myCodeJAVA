//introduction to multithreading in java


public class Threads1 {
    public static void main(String[] args){
        new A().start();
        //new A() => creating a temporary object of class A (which is not having any name), and it is calling start(). 
        new B().start();
        new C().start();
    }
}

//A, B, C are a threaded class 
class A extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("i = "+i);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int j=0; j<5; j++){
            System.out.println("j = "+j);
        }
    }
}

class C extends Thread{
    public void run(){
        for(int k=0; k<5; k++){
            System.out.println("k = "+k);
        }
    }
}