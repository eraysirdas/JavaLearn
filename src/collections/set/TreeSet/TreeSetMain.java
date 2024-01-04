package collections.set.TreeSet;

import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {

        TreeSet<StudentTreeSet> student = new TreeSet<>(new OrderNoteComparable());//içi boş olduğu için altını çizer bir comparable(sıralama) vermeliyiz.
        student.add(new StudentTreeSet("nazlı",70));
        student.add(new StudentTreeSet("eray",90));
        student.add(new StudentTreeSet("ali",20));
        student.add(new StudentTreeSet("veli",100));
        student.add(new StudentTreeSet("berkay",10));


        for(StudentTreeSet set : student){
            System.out.println(set.getName()+"\t"+set.getNote());
        }


        System.out.println();

        TreeSet<StudentTreeSet> student2 = new TreeSet<>(new OrderNameComparable());//içi boş olduğu için altını çizer bir comparable(sıralama) vermeliyiz.
        student2.add(new StudentTreeSet("nazli",70));
        student2.add(new StudentTreeSet("eray",90));
        student2.add(new StudentTreeSet("ali",20));
        student2.add(new StudentTreeSet("veli",100));
        student2.add(new StudentTreeSet("berkay",10));


        for(StudentTreeSet set : student2){
            System.out.println(set.getName()+"\t"+set.getNote());
        }


    }
}
