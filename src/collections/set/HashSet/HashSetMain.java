package collections.set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet();
        hSet.add(10);
        hSet.add(30);
        hSet.add(20);
        hSet.add(10);

        for (Integer i :hSet) {
            System.out.println(i);
        }

        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
