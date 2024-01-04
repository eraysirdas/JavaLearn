package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.size());
        System.out.println(list.indexOf(20));//girilen sayının ilk görüldüğü indisi belirtir.
        System.out.println(list.lastIndexOf(20));//girilen sayının son görüldüğü indisi verir.
        list.add(2,15);//araya değer ekler.
        list.set(0,5); //girilen indisteki yeri değiştirir.
        list.remove(5);//objeyi veya indisi vererek sağlayabiliriz.

        for (Integer i : list){
            System.out.println(i);
        }

        List<Integer> liste2 = new ArrayList<>(list);//aynı collectionsa sahip listeleri biribirne böyle atabiliriz.
        liste2.addAll(list);// veya bu şekilde sağlayabilriiz
        System.out.println(liste2);


        Integer[] num =list.toArray(new Integer[0]); //Arraylistten bir indisteki değeri başka diziye atmaya yarar.
        System.out.println(num[0]);

        list.clear();// listeyi temizler
        System.out.println(list);
    }
}
