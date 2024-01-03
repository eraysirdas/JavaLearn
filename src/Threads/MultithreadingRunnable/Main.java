package Threads.MultithreadingRunnable;
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t1.start();
        t2.start();
    }
}
/*Extend Thread den farkı tek bir threadi birden çok kez başlatmak yerine birden fazla
thread ile çalışarak iş bölümünü bu şekilde yapması
 */