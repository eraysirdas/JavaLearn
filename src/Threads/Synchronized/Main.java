package Threads.Synchronized;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MultiThread mt = new MultiThread();

        List<Thread> threadList = new ArrayList<>();

        for(int i =0;i<10;i++){
            Thread t1 = new Thread(mt);
            threadList.add(t1);

            t1.start();

        }
        for(Thread itr : threadList){ //join() bir threadin işi bitince diğerinin çalışmasına izin veren yapıdır
            itr.join();
        }

        System.out.println("OrderNumber : "+mt.getOrderNumber());

    }
}
