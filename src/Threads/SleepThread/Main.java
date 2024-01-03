package Threads.SleepThread;

class Counter implements Runnable{
    private  boolean  isRun=true;
    int i=0;
    @Override
    public void run() {
        while(isRun){
            try {
                Thread.sleep(1000); // bunu yapmadığımızda çok fazla çalışıp fazla sonuç getiriyor o yüzden burada da bekletmemiz lazım
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" : "+ i++);
        }
    }
    public void stop(){
        this.isRun=false;
    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException { //sleep için ekledık throwu
        Counter c1 = new Counter();

        Thread t1 = new Thread(c1);

        t1.start();
        Thread.sleep(4000);
        c1.stop(); //stop metodu olmadıgı ıcın kendımız yazdık
    }
}
