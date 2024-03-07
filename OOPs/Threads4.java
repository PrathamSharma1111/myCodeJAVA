public class Threads4 {
    public static void main(String[] args){
        A aa = new A();
        B bb = new B();
        C cc = new C();
        aa.setPriority(Thread.MIN_PRIORITY);
        bb.setPriority(Thread.NORM_PRIORITY);
        cc.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\nInside main thread and it's ID is: "+Thread.currentThread().getId()+"\nMain thread priority = "+Thread.currentThread().getPriority());
        System.out.println("now calling other threads: Thread A -> Thread B -> Thread C");
        aa.start();
        bb.start();
        cc.start();
    }
}

class A extends Thread{
    public void run(){
        System.out.println("\nInside thread A: \nThread ID: \t"+Thread.currentThread().getId()+"\nThread Priority: \t"+Thread.currentThread().getPriority());
    }
}
class B extends Thread{
    public void run(){
        System.out.println("\nInside thread B: \nThread ID: \t"+Thread.currentThread().getId()+"\nThread Priority: \t"+Thread.currentThread().getPriority());
    }
}
class C extends Thread{
    public void run(){
        System.out.println("\nInside thread C: \nThread ID: \t"+Thread.currentThread().getId()+"\nThread Priority: \t"+Thread.currentThread().getPriority());
    }
}