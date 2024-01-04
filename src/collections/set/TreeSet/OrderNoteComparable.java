package collections.set.TreeSet;

import java.util.Comparator;

public class OrderNoteComparable implements Comparator<StudentTreeSet> {

    @Override
    public int compare(StudentTreeSet o1, StudentTreeSet o2) {
        return (o2.getNote()-o1.getNote());
    }
}
//ilk aldığı öğrencinin notu ikinciden
// büyükse sonuç pozitif çıkar,küçükse de negatif
// çıkar çıkan bu integer değerine göre sıralar.