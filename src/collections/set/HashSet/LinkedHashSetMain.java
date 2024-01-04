package collections.set.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lHSet = new LinkedHashSet<>();
        lHSet.add(10);
        lHSet.add(20);
        lHSet.add(30);
        lHSet.add(10);

        Iterator<Integer> itr = lHSet.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
