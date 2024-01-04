package collections.Queue.PriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }.reversed());

        pq.add("eray");
        pq.add("ahmet");
        pq.add("resul");
        pq.add("yunus");

        for(String s : pq){
            System.out.println(s);
        }
    }
}
