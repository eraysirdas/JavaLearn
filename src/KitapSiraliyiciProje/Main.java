package KitapSiraliyiciProje;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet(new OrderComparableName());
        treeSet.add(new Book("Kürk Mantolu Madonna", 160, 1943, "Sabahattin Ali"));
        treeSet.add(new Book("Hayvan Çiftliği", 152, 2020, "George Orwell"));
        treeSet.add(new Book("Satranç", 83, 2020, "Stefan Zweig"));
        treeSet.add(new Book("Dönüşüm", 72, 2022, "Franz Kafka"));
        treeSet.add(new Book("Simyacı", 188, 1988, "Paulo Coelho"));

        for(Book itr : treeSet){
            System.out.println(itr.getBookName()+ "\t" + itr.getPage());
        }

        System.out.println();

        TreeSet<Book> treeSet2 = new TreeSet(new OrderComparablePage());
        treeSet2.add(new Book("Kürk Mantolu Madonna", 160, 1943, "Sabahattin Ali"));
        treeSet2.add(new Book("Hayvan Çiftliği", 152, 2020, "George Orwell"));
        treeSet2.add(new Book("Satranç", 83, 2020, "Stefan Zweig"));
        treeSet2.add(new Book("Dönüşüm", 72, 2022, "Franz Kafka"));
        treeSet2.add(new Book("Simyacı", 188, 1988, "Paulo Coelho"));

        for(Book itr : treeSet2){
            System.out.println(itr.getBookName()+ "\t" + itr.getPage());
        }
    }
}
