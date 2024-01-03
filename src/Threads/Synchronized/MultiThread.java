package Threads.Synchronized;

import java.util.concurrent.locks.Lock;

public class MultiThread implements Runnable{
    private int orderNumber;
    private final Object LOCK = new Object(); // synchronized vermek için bir obje yaratıp final kullandığımız için initiliaze ettik

    public MultiThread() {
        this.orderNumber = 0;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /*synchronized (LOCK){ //birinci yol, objeyi oluşturup verdik.
            this.orderNumber++;
            System.out.println(Thread.currentThread().getName()+" OrderNumber : "+this.orderNumber);
        }*/
        syncMetot();
    }
    public int getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public synchronized void syncMetot(){ //ikinci yol da ise sync oluşturup bunun referans çağrısını metot içinde yaptık
        this.orderNumber++;
        System.out.println(Thread.currentThread().getName()+" OrderNumber : "+this.orderNumber);
    }
}
//TODO race condinition önlemenin iki yolu var
// 1- metot içinde synchronized () kullanımı ve buna bir Obje verilmesi
// 2- synchronized () metot dışında yazılması ve metotota referans ile çağrılması (burada obje vermeye de gerek yok)