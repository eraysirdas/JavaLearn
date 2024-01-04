package collections.list.vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("ordu");
        vector.add("ankara");
        vector.add("samsun");

        for(String s : vector){
            System.out.println(s);
        }
    }
}
