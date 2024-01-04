package collections.set.TreeSet;

import java.util.Comparator;

public class OrderNameComparable implements Comparator<StudentTreeSet> {
    @Override
    public int compare(StudentTreeSet o1, StudentTreeSet o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
