package collections.Queue.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListMain {
    public static void main(String[] args) {
        Queue<String> que =new LinkedList<>();
        que.add("e");
        que.add("r");
        que.add("a");
        que.add("y");

        Iterator<String> itr = que.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println(que.poll()); //e kuyruktan çıkarıldı
        System.out.println(que.element()); //kuyruğun ilk elemanı verildi(e çıktığı için r
        System.out.println(que.peek()); // sıradaki elemanı bana verdi
        System.out.println(que.offer("eray")); // eray başarılı bir şekilde kuyruğa eklendi

        for(String s : que){
            System.out.println(s);
        }
    }
}
