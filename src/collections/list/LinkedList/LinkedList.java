package collections.list.LinkedList;

import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> liste = new java.util.LinkedList<>();
        liste.add("eray");
        liste.add("eren");
        liste.add("enis");
        liste.add("java");

        Iterator<String> itr = liste.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
