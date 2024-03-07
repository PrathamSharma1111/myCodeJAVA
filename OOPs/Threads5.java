public class Threads5 {
    public static void main(String[] args){
        A aa = new A();
        Thread tt = new Thread(aa);
        tt.start();
        System.out.println("End of main thread");
    }
}

class A implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Thread A"+i);
        }
        System.out.println("End of thread A");
    }
}