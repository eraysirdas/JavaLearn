package Threads.FirstMain;

 class Counter extends Thread{ //Thread sınıfını ekledik

    @Override
    public void run() {
        for(int i =0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" : " +i); //Thread.currentThread() ile o anda aktif olarak çalışan iş parçacığının referansını alabiliyoruz
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.start();//threadları baslatmak ıcın start metodunu kullandık run metodundan cagırırsak treadler calısmaz
        c2.start();
    }
}
